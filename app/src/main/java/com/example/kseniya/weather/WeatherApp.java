package com.example.kseniya.weather;

import android.app.Application;
import android.content.Context;

import com.example.kseniya.weather.data.NetworkBuilder;
import com.example.kseniya.weather.data.RetrofitService;


public class WeatherApp extends Application {
    private RetrofitService  service;
    @Override
    public void onCreate() {
        super.onCreate();
        service = NetworkBuilder.initService();
    }
    public static   WeatherApp get(Context  context ){
        return (WeatherApp) context.getApplicationContext();
    }
    public  RetrofitService  getService(){
        return service;
    }

}
