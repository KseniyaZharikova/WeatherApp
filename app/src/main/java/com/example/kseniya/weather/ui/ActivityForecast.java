package com.example.kseniya.weather.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.modelsForecastWeather.Forecast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityForecast extends ActivityBase{
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
        Intent intent= getIntent();
        service.getWeatherForMore(intent.getStringExtra("locationKey"), getString(R.string.api_key1),"ru-RU",true)
                .enqueue(new Callback<Forecast>() {
                    @Override
                    public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            Forecast model = response.body();

                            AdapterForWeatherFiveDays adapter = new AdapterForWeatherFiveDays(getApplicationContext(),
                                    model.getDailyForecasts());
                            listView.setAdapter(adapter);
                        }else {
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




