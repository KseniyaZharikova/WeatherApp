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
import com.example.kseniya.weather.data.modelsCurrentWeather.CurrentModel;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForLocation.Example;
import com.example.kseniya.weather.config.Constans;
import com.example.kseniya.weather.ui.BaseActivity;
import com.example.kseniya.weather.ui.forecast.ForecastActivity;
import com.example.kseniya.weather.ui.search.SearchActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BishkekActivity extends BaseActivity implements View.OnClickListener, BishkekContract.View {
    private Button button;
    private TextView tvCity, tvDate, tvTemperature, tvDetails, tvRealFeel, tvCloud_cover, tvHumidity, tvWind_speed, tvPressure, tvVisibility;
    private ImageView imageView;
    private String locationKey;
    private BishkekPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bishkek);
        tvCity = findViewById(R.id.tvCity);
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
        mPresenter = new BishkekPresenter(getApplicationContext());
        mPresenter.bind(this);
        mPresenter.getContryCurrent(getIntent().getStringExtra("GetLatitude"), getIntent().getStringExtra("GetLongitude"));
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(BishkekActivity.this, ForecastActivity.class);
        intent.putExtra("key", locationKey);
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
    }

    @Override
    public void onSuccessLocation(Example model) {
        tvCity.setText(model.getLocalizedName());
        locationKey = model.getKey();
        mPresenter.getWeather(locationKey);
    }

    @Override
    public void onSuccessCurrent(List<CurrentModel> model) {
        tvDetails.setText(model.get(0).getWeatherText());
        tvDate.setText(model.get(0).getLocalObservationDateTime().toString());
        tvRealFeel.setText("Ощущается: " + model.get(0).getRealFeelTemperature().getMetric().getValue().toString());
        tvTemperature.setText(model.get(0).getTemperature().getMetric().getValue().toString());
        tvCloud_cover.setText("Облачность: " + String.format("%s %%", model.get(0).getCloudCover().toString()));
        tvHumidity.setText("Влажность: " + String.format("%s%%", model.get(0).getRelativeHumidity().toString()));
        tvWind_speed.setText("Скорость ветра: " + String.format("%s%s", model.get(0).getWind().getSpeed().getMetric().getValue().toString(), model.get(0).getWind().getSpeed().getMetric().getUnit().toString()));
        tvPressure.setText("Давление: " + String.format("%s%s", model.get(0).getPressure().getMetric().getValue().toString(), model.get(0).getPressure().getMetric().getUnit().toString()));
        tvVisibility.setText("Видимость: " + String.format("%s%s", model.get(0).getVisibility().getMetric().getValue().toString(), model.get(0).getVisibility().getMetric().getUnit().toString()));
        int icon = model.get(0).getWeatherIcon();
        String imageUrl;
        if (icon < 10) {
            imageUrl = String.format(Constans.ICONS_URL, icon);
        } else {
            imageUrl = String.format(Constans.ICONS_URLMORE, icon);
        }
        Picasso.get().load(imageUrl).into(imageView);
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showInvalidCityMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showLoadingIndicator() {
        showProgressBar();
    }

    @Override
    public void hideLoadingIndicator() {
        dismissProgressBar();
    }
}

