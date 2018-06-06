package com.example.kseniya.weather.ui.bishkek;

import android.content.Context;
import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.data.modelsCurrentWeather.CurrentModel;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForLocation.Example;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class BishkekPresenter implements BishkekContract.Presenter {
    private Context mContext;
    private RetrofitService mService;
    private BishkekContract.View mView;
    public BishkekPresenter(Context context) {
        mService = WeatherApp.get(mContext = context).getService();
    }
    @Override
    public void getContryCurrent(String lat, String lon) {
        if (isValidData(lat)) {
            if (isViewAttached()) mView.showLoadingIndicator(); }
        mService.getCurrentLocation(String.format("%1s,%2s", lat, lon), mContext.getString(R.string.api_key3), "ru-Ru")
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            if (isViewAttached()) mView.onSuccessLocation(response.body());
                        } else {
                            if (isViewAttached())
                                mView.showInvalidCityMessage(response.message());
                        }
                        if (isViewAttached()) mView.hideLoadingIndicator();
                    }
                    @Override
                    public void onFailure(Call<Example> call, Throwable throwable) {
                        mView.onError(throwable.getMessage());
                        mView.hideLoadingIndicator();
                    }
                });
    }
    @Override
    public void getWeather(String key) {
        if (isValidData(key)) {
            if (isViewAttached()) mView.showLoadingIndicator();
        }
        mService.getCurrentWeather(key, mContext.getString(R.string.api_key3), "ru-Ru", true)
                .enqueue(new Callback<List<CurrentModel>>() {
                    @Override
                    public void onResponse(Call<List<CurrentModel>> call, Response<List<CurrentModel>> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            if (isViewAttached()) mView.onSuccessCurrent(response.body());
                        } else {
                            if (isViewAttached())
                                mView.showInvalidCityMessage(response.message());
                        }
                        if (isViewAttached()) mView.hideLoadingIndicator();
                    }
                    @Override
                    public void onFailure(Call<List<CurrentModel>> call, Throwable throwable) {
                        mView.onError(throwable.getMessage());
                        mView.hideLoadingIndicator();
                    }}); }
    @Override
    public void bind(BishkekContract.View view) {
        this.mView = view;
    }
    @Override
    public void unbind() {
        this.mView = null;
    }
    private boolean isValidData(String city) {
        return !city.trim().isEmpty();
    }
    private boolean isViewAttached() {
        return mView != null;
    }
}
