package com.example.kseniya.weather.ui;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kseniya.weather.R;

import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.modelsForecastWeather.DailyForecast;
import com.example.kseniya.weather.modelsForecastWeather.Forecast;
import com.example.kseniya.weather.utils.Constans;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AdapterForWeatherFiveDays extends ArrayAdapter {
    Context context;
    List<DailyForecast> list;


    public AdapterForWeatherFiveDays(@NonNull Context context, List<DailyForecast> list) {
        super(context, 0, list);
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_one, parent, false);

            holder.tvUpdate = convertView.findViewById(R.id.tvUpdate);
            holder.tvTemperature = convertView.findViewById(R.id.tvTemperature);
            holder.tvDetails = convertView.findViewById(R.id.tvDetails);
            holder.image = convertView.findViewById(R.id.iconMy);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        DailyForecast model = (DailyForecast) getItem(position);

        if (model != null) {
            holder.tvUpdate.setText(String.valueOf(model.getDate()));
           holder.tvTemperature.setText(String.valueOf(model.getTemperature().getMaximum().getValue() + "/"
                    + model.getTemperature().getMinimum().getValue()));
            holder.tvDetails.setText(model.getDay().getIconPhrase());
            int icon = model.getDay().getIcon();
            String imageUrl;
            if (icon < 10) {
                imageUrl = String.format(Constans.ICONS_URL, icon);
            } else {
                imageUrl = String.format(Constans.ICONS_URLMORE, icon);
            }

            Picasso.get().load(imageUrl).into(holder.image);
        }
        return convertView;
    }

    private class ViewHolder {
        TextView tvUpdate, tvTemperature, tvDetails;
        ImageView image;

    }
}
