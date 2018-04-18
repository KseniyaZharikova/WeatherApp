package com.example.kseniya.weather.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.modelsDayCurrentWeather.CurrentModel;
import com.example.kseniya.weather.modelsDayCurrentWeather.ModelsForLocation.Example;
import com.example.kseniya.weather.utils.Constans;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityBishkek extends ActivityBase implements View.OnClickListener {
    private Button button;
    private TextView tvCity, tvDate, tvTemperature, tvDetails;
    private ImageView imageView;
    private RetrofitService service;
    private FrameLayout progressBar;
    String locationKey;
    Example model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bishkek);
        tvCity = findViewById(R.id.tvCity);
        tvDate = findViewById(R.id.tvDate);
        tvTemperature = findViewById(R.id.tvTemperature);
        tvDetails = findViewById(R.id.tvDetails);
        button = findViewById(R.id.btnCurrent);
        button.setOnClickListener(this);
        imageView = findViewById(R.id.iconWeather);
//        progressBar = findViewById(R.id.frame);
        service = WeatherApp.get(getApplicationContext()).getService();
        showProgressBar();
        getLocationForWeather();

    }

    private void getLocationForWeather() {
        String lat = getIntent().getStringExtra("location1");
        String lon = getIntent().getStringExtra("location2");
        service.getCurrentLocation(String.format("%1s,%2s",lat,lon), getString(R.string.api_key2),"ru-Ru")
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            model = response.body();
                            tvCity.setText(model.getLocalizedName());
                            locationKey = model.getKey();
                            getCurrentWeather();
                        } else {
                            Toast.makeText(getApplicationContext(),"Сервер не отвечает",Toast.LENGTH_LONG).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable throwable) {
                        Toast.makeText(getApplicationContext(),"Подключенияе к интернету отсутсвует", Toast.LENGTH_LONG).show();
                    }
                });

    }

    private void getCurrentWeather() {


        service.getCurrentWeather(locationKey, getString(R.string.api_key2),"ru-Ru")
                .enqueue(new Callback<List<CurrentModel>>() {
                    @Override
                    public void onResponse(Call<List<CurrentModel>> call, Response<List<CurrentModel>> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            List<CurrentModel> currentModel = response.body();
                            tvDetails.setText(currentModel.get(0).getWeatherText());
                            tvDate.setText(currentModel.get(0).getLocalObservationDateTime().toString());
                            tvTemperature.setText(currentModel.get(0).getTemperature().getMetric().getValue().toString());
                            int icon = currentModel.get(0).getWeatherIcon();
                            String imageUrl;
                            if (icon < 10) {
                                imageUrl = String.format(Constans.ICONS_URL, icon);
                            } else {
                                imageUrl = String.format(Constans.ICONS_URLMORE, icon);
                            }
                            Picasso.get().load(imageUrl).into(imageView);
                        }else {
                            Toast.makeText(getApplicationContext(),"Сервер не отвечает",Toast.LENGTH_LONG).show();

                        }


                        dismissProgressBar();
                    }


                    @Override
                    public void onFailure(Call<List<CurrentModel>> call, Throwable t) {

                    }
                });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ActivityBishkek.this, ActivityForecast.class);
        intent.putExtra("locationKey", locationKey);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.Item1:
                Intent intent = new Intent(ActivityBishkek.this, ActivitySearch.class);
                startActivityForResult(intent,0);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        locationKey = data.getStringExtra("locationKey");
        tvCity.setText(data.getStringExtra("CityName"));
        getCurrentWeather();
    }
}

