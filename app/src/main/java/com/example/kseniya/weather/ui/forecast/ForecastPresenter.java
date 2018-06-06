package com.example.kseniya.weather.ui.forecast;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForecast.Forecast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForecastPresenter implements ForecastContract.Presenter {


    private Context mContext;
    private RetrofitService mService;
    private ForecastContract.View mView;


    public ForecastPresenter(Context context) {
        mService = WeatherApp.get(mContext = context).getService();
    }

    @Override
    public void getForecast(String key) {
        if (isValidData(key)) {
            if (isViewAttached()) mView.showLoadingIndicator();

        }
        mService.getWeatherForecast(key, mContext.getString(R.string.api_key3), "ru-RU", false, true)
                .enqueue(new Callback<Forecast>() {
                    @Override
                    public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                        Log.d("0000000000000", "" + response.isSuccessful() + response.body() + isViewAttached());
                        if (response.isSuccessful() && response.body() != null) {
                            if (isViewAttached()) mView.onSuccess(response.body());

                        } else {
                            if (isViewAttached())
                                mView.showInvalidCityMessage(response.message());

                        }
                        if (isViewAttached()) mView.hideLoadingIndicator();
                    }

                    @Override
                    public void onFailure(Call<Forecast> call, Throwable t) {
                        mView.onError(t.getMessage());
                        mView.hideLoadingIndicator();
                    }
                });

    }

    @Override
    public void bind(ForecastContract.View view) {
        this.mView = view;
    }

    private boolean isValidData(String city) {
        return !city.trim().isEmpty();
    }

    @Override
    public void unbind() {
        this.mView = null;
    }

    private boolean isViewAttached() {
        return mView != null;
    }
}
