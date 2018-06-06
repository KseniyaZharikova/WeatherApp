package com.example.kseniya.weather.ui.bishkek;

import com.example.kseniya.weather.IProgressBar;
import com.example.kseniya.weather.Lifecycle;
import com.example.kseniya.weather.data.modelsCurrentWeather.CurrentModel;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForLocation.Example;


import java.util.List;

public interface BishkekContract {
    interface View extends IProgressBar {
        void onSuccessLocation(Example model);

        void onSuccessCurrent(List<CurrentModel> model);

        void onError(String msg);

        void showInvalidCityMessage(String msg);
    }

    interface Presenter extends Lifecycle<BishkekContract.View> {
        void getContryCurrent(String lat, String lon);

        void getWeather(String locationKey);

    }
}
