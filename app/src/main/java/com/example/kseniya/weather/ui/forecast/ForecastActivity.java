package com.example.kseniya.weather.ui.forecast;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForecast.Forecast;
import com.example.kseniya.weather.ui.BaseActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForecastActivity extends BaseActivity {
    ListView listView;
    private RetrofitService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        service = WeatherApp.get(getApplicationContext()).getService();
        listView = findViewById(R.id.showMoreList);
        showProgressBar();
        getWeatherMore();


    }

    private void getWeatherMore() {
        Intent intent = getIntent();
        service.getWeatherForecast(intent.getStringExtra("locationKey"), getString(R.string.api_key1), "ru-RU", false, true)
                .enqueue(new Callback<Forecast>() {
                    @Override
                    public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            Forecast model = response.body();

                            WeatherFiveDaysAdapter adapter = new WeatherFiveDaysAdapter(getApplicationContext(),
                                    model.getDailyForecasts());
                            listView.setAdapter(adapter);
                        } else {
                            Toast.makeText(getApplicationContext(), "данные не найдены ", Toast.LENGTH_LONG).show();

                        }
                        dismissProgressBar();
                    }

                    @Override
                    public void onFailure(Call<Forecast> call, Throwable t) {

                    }
                });
    }

}




