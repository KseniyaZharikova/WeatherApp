package com.example.kseniya.weather.ui.search;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.data.modelsCurrentWeather.modelsSearch.SearchPlaceModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchPresenter implements SearchContract.Presenter {

    private Context mContext;
    private RetrofitService mService;
    private SearchContract.View mView;


    public SearchPresenter(Context context) {
        mService = WeatherApp.get(mContext = context).getService();
    }

    @Override
    public void getWeatherByName(String city) {
        if (isValidData(city)) {
            if (isViewAttached()) mView.showLoadingIndicator();
            mService.searchPlace(city, mContext.getString(R.string.api_key1), "ru-Ru")
                    .enqueue(new Callback<List<SearchPlaceModel>>() {
                        @Override
                        public void onResponse(Call<List<SearchPlaceModel>> call, Response<List<SearchPlaceModel>> response) {
                            if (response.isSuccessful() && response.body() != null) {
                                if (isViewAttached()) mView.onSuccess(response.body());
                            } else {
                                if (isViewAttached())
                                    mView.showInvalidCityMessage(response.message());
                            }
                            if (isViewAttached()) mView.hideLoadingIndicator();
                        }

                        @Override
                        public void onFailure(Call<List<SearchPlaceModel>> call, Throwable t) {
                            mView.onError(t.getMessage());
                            mView.hideLoadingIndicator();
                        }
                    });
        }
    }

    @Override
    public void bind(SearchContract.View view) {
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
