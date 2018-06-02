package com.example.kseniya.weather.ui.forecast;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kseniya.weather.R;

import com.example.kseniya.weather.data.modelsCurrentWeather.modelsForecast.DailyForecast;

import com.example.kseniya.weather.config.Constans;
import com.squareup.picasso.Picasso;

import java.util.List;


public class WeatherFiveDaysAdapter extends ArrayAdapter {
    Context context;
    List<DailyForecast> list;


    public WeatherFiveDaysAdapter(@NonNull Context context, List<DailyForecast> list) {
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
            holder.tvTemperature.setText(String.valueOf(model.getTemperature().getMaximum().getValue().toString()
                    + model.getTemperature().getMaximum().getUnit().toString()));
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
