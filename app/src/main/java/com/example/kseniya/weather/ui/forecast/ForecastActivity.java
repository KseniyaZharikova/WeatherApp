package com.example.kseniya.weather.ui.forecast;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForecast.Forecast;
import com.example.kseniya.weather.ui.BaseActivity;

public class ForecastActivity extends BaseActivity implements ForecastContract.View {
    private ListView listView;
    private ForecastPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        mPresenter = new ForecastPresenter(getApplicationContext());
        mPresenter.bind(this);
        mPresenter.getForecast(getIntent().getStringExtra("key"));
        listView = findViewById(R.id.showMoreList);
    }

    @Override
    public void onSuccess(Forecast model) {
        WeatherFiveDaysAdapter adapter = new WeatherFiveDaysAdapter(getApplicationContext(),
                model.getDailyForecasts());
        listView.setAdapter(adapter);
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showInvalidCityMessage(String msg) {

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




