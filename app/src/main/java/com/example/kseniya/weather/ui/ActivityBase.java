package com.example.kseniya.weather.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.modelsDayCurrentWeather.CurrentModel;
import com.example.kseniya.weather.modelsDayCurrentWeather.ModelsForLocation.Example;
import com.example.kseniya.weather.ui.ActivityForecast;
import com.example.kseniya.weather.ui.ActivitySearch;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class ActivityBase extends AppCompatActivity {
    private ProgressDialog mDialog;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected void showProgressBar() {
        if (mDialog == null) {
            mDialog = new ProgressDialog(this);
            mDialog.setMessage(" Загрузка погоды ");
            mDialog.show();
        }
    }

    protected void dismissProgressBar() {
        if (mDialog != null && mDialog.isShowing()) {
            mDialog.dismiss();

        }
        mDialog = null;
    }

}