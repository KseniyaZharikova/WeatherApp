package com.example.kseniya.weather.ui;

import android.annotation.SuppressLint;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import android.os.IBinder;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.WeatherApp;
import com.example.kseniya.weather.data.RetrofitService;
import com.example.kseniya.weather.modelsDayCurrentWeather.CurrentModel;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityLocation extends AppCompatActivity {
    private LocationManager locationManager;
    Location location;
    ServiceForNotification serviceNotification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bishkek);
        showLocation(location);
        bindService(new Intent(this, ServiceForNotification.class), serviceConnection, BIND_AUTO_CREATE);



    }
    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            ServiceForNotification.GetService getService = (ServiceForNotification.GetService) service;
            serviceNotification = getService.myService();

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @SuppressLint("MissingPermission")
    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();
        locationManager.removeUpdates(locationListener);
    }

    private LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            showLocation(location);

        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @SuppressLint("MissingPermission")
        @Override
        public void onProviderEnabled(String provider) {

            showLocation(locationManager.getLastKnownLocation(provider));
        }

        @Override
        public void onProviderDisabled(String provider) {
        }
    };

    @SuppressLint("MissingPermission")
    public String showLocation(Location location) {
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,
                1000 * 10, 10, locationListener);

        if (location == null) return "";
            Intent intent =  new Intent(ActivityLocation.this,ActivityBishkek.class);
            intent.putExtra("location1",formatLocationGetLatitude(location));
            intent.putExtra("location2",formatLocationGetLongitude(location));
            startActivity(intent);
        return formatLocationGetLatitude(location);
    }

    @SuppressLint("DefaultLocale")
    public String formatLocationGetLatitude(Location location) {
        if (location == null) {
            return "";
        }
        return String.format("%1$.4f",
                location.getLatitude()).replace(",",".");


    }
    @SuppressLint("DefaultLocale")
    public String formatLocationGetLongitude(Location location) {
        if (location == null) {
            return "";
        }
        return String.format("%1$.4f",
                location.getLongitude()).replace(",",".");


    }
}

