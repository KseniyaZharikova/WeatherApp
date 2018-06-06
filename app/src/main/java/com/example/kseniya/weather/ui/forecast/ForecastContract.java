package com.example.kseniya.weather.ui.forecast;


import com.example.kseniya.weather.IProgressBar;
import com.example.kseniya.weather.Lifecycle;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForecast.Forecast;

public interface ForecastContract {
    interface View extends IProgressBar {
        void onSuccess(Forecast model);

        void onError(String msg);

        void showInvalidCityMessage(String msg);
    }

    interface Presenter extends Lifecycle<View> {
        void getForecast(String city);

    }
}
