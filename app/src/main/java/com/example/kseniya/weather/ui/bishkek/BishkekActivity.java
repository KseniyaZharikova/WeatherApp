package com.example.kseniya.weather.ui.bishkek;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.data.modelsCurrentWeather.CurrentModel;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForLocation.Example;
import com.example.kseniya.weather.config.Constans;
import com.example.kseniya.weather.ui.BaseActivity;
import com.example.kseniya.weather.ui.forecast.ForecastActivity;
import com.example.kseniya.weather.ui.search.SearchActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BishkekActivity extends BaseActivity implements View.OnClickListener {
    private Button button;
    private TextView tvCity, tvNow, tvDate, tvTemperature, tvDetails, tvRealFeel, tvCloud_cover, tvHumidity, tvWind_speed, tvPressure, tvVisibility;
    private ImageView imageView;
    private RetrofitService service;
    String locationKey;
    Example model;
    private CurrentModel current;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bishkek);
        tvCity = findViewById(R.id.tvCity);
        tvNow = findViewById(R.id.tvNow);
        tvDate = findViewById(R.id.tvDate);
        tvRealFeel = findViewById(R.id.tvRealFeel);
        tvTemperature = findViewById(R.id.tvTemperature);
        tvDetails = findViewById(R.id.tvDetails);
        tvCloud_cover = findViewById(R.id.cloud_cover);
        tvHumidity = findViewById(R.id.humidity);
        tvWind_speed = findViewById(R.id.wind_speed);
        tvPressure = findViewById(R.id.pressure);
        tvVisibility = findViewById(R.id.visibility);
        button = findViewById(R.id.btnCurrent);
        button.setOnClickListener(this);
        imageView = findViewById(R.id.iconWeather);
        service = WeatherApp.get(getApplicationContext()).getService();
        showProgressBar();
        getLocationForWeather();


    }

    private void getLocationForWeather() {
        String lat = getIntent().getStringExtra("GetLatitude");
        String lon = getIntent().getStringExtra("GetLongitude");
        service.getCurrentLocation(String.format("%1s,%2s", lat, lon), getString(R.string.api_key1), "ru-Ru")
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            model = response.body();
                            tvCity.setText(model.getLocalizedName());
                            locationKey = model.getKey();
                            getCurrentWeather();
                        } else {

                            Toast.makeText(getApplicationContext(), "Сервер не отвечает", Toast.LENGTH_LONG).show();
                            dismissProgressBar();
                        }
                    }
                    @Override
                    public void onFailure(Call<Example> call, Throwable throwable) {
                        Toast.makeText(getApplicationContext(), "Подключенияе к интернету отсутсвует", Toast.LENGTH_LONG).show();
                    }
                });

    }

    private void getCurrentWeather() {
        service.getCurrentWeather(locationKey, getString(R.string.api_key1), "ru-Ru", true)
                .enqueue(new Callback<List<CurrentModel>>() {
                    @Override
                    public void onResponse(Call<List<CurrentModel>> call, Response<List<CurrentModel>> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            List<CurrentModel> currentModel = response.body();
                            current = currentModel.get(0);
                            tvDetails.setText(current.getWeatherText());
                            tvDate.setText(current.getLocalObservationDateTime().toString());
                            tvRealFeel.setText("Ощущается: " + current.getRealFeelTemperature().getMetric().getValue().toString());
                            tvTemperature.setText(current.getTemperature().getMetric().getValue().toString());
                            tvCloud_cover.setText("Облачность: " + String.format("%s %%", current.getCloudCover().toString()));
                            tvHumidity.setText("Влажность: " + String.format("%s%%", current.getRelativeHumidity().toString()));
                            tvWind_speed.setText("Скорость ветра: " + String.format("%s%s", current.getWind().getSpeed().getMetric().getValue().toString(), currentModel.get(0).getWind().getSpeed().getMetric().getUnit().toString()));
                            tvPressure.setText("Давление: " + String.format("%s%s", current.getPressure().getMetric().getValue().toString(), currentModel.get(0).getPressure().getMetric().getUnit().toString()));
                            tvVisibility.setText("Видимость: " + String.format("%s%s", current.getVisibility().getMetric().getValue().toString(), currentModel.get(0).getVisibility().getMetric().getUnit().toString()));
                            int icon = currentModel.get(0).getWeatherIcon();
                            String imageUrl;
                            if (icon < 10) {
                                imageUrl = String.format(Constans.ICONS_URL, icon);
                            } else {
                                imageUrl = String.format(Constans.ICONS_URLMORE, icon);
                            }
                            Picasso.get().load(imageUrl).into(imageView);
                        } else {
                            Toast.makeText(getApplicationContext(), "Сервер не55555555 отвечает", Toast.LENGTH_LONG).show();

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
        Intent intent = new Intent(BishkekActivity.this, ForecastActivity.class);
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
                Intent intent = new Intent(BishkekActivity.this, SearchActivity.class);
                startActivityForResult(intent, 0);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        locationKey = data.getStringExtra("locationKey");
        tvCity.setText(data.getStringExtra("CityName"));
        getCurrentWeather();
    }


}

