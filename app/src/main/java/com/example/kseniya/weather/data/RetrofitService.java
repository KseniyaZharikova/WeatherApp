package com.example.kseniya.weather.data;

import com.example.kseniya.weather.forecastModels.Forecast;
import com.example.kseniya.weather.modelsDayCurrentWeather.CurrentModel;
import com.example.kseniya.weather.modelsDayCurrentWeather.ModelsForLocation.Example;

import com.example.kseniya.weather.modelsSearch.SearchPlaceModel;
import com.example.kseniya.weather.utils.Constans;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Path;
import retrofit2.http.Query;


public interface RetrofitService {


    @GET("locations/v1/cities/geoposition/search.json")
    Call<Example> getCurrentLocation(@Query("q") String q,
                                     @Query("apikey") String apikey,
                                     @Query("language") String language);

    @GET("/locations/v1/cities/autocomplete")
    Call<List<SearchPlaceModel>> searchPlace(@Query("q") String q,
                                             @Query("apikey") String apikey,
                                             @Query("language") String language);

    @GET("currentconditions/v1/{name}")
    Call<List<CurrentModel>> getCurrentWeather(@Path("name") String name,
                                               @Query("apikey") String apiKey,
                                               @Query("language") String language,
                                               @Query("details") boolean details);


    @GET(Constans.URL_FORECAST + "{name}")
    Call<Forecast> getWeatherForecast(@Path("name") String name,
                                     @Query("apikey") String apikey,
                                     @Query("language") String language,
                                     @Query("details") boolean details,
                                     @Query("metric") boolean metric);


}
