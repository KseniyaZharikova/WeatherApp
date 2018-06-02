package com.example.kseniya.weather.ui.search;

import com.example.kseniya.weather.IProgressBar;
import com.example.kseniya.weather.Lifecycle;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsSearch.SearchPlaceModel;

import java.util.List;

public interface SearchContract {
    interface View extends IProgressBar {
        void onSuccess(List<SearchPlaceModel> model);

        void onError(String msg);

        void showInvalidCityMessage(String msg);
    }

    interface Presenter extends Lifecycle<View> {
        void getWeatherByName(String city);

    }
}

