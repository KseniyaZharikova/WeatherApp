package com.example.kseniya.weather.ui;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.example.kseniya.weather.ui.bishkek.BishkekActivity;


public class FindLocation extends AppCompatActivity {
    private LocationManager locationManager;
    Location location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {

            showLocation(location);
            return;
        }

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 10);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        showLocation(location);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (locationManager != null) locationManager.removeUpdates(locationListener);
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

        if (location != null) {
            Intent intent = new Intent(FindLocation.this, BishkekActivity.class);
            intent.putExtra("location1", formatLocationGetLatitude(location));
            intent.putExtra("location2", formatLocationGetLongitude(location));
            startActivity(intent);
            finish();
        }

        return formatLocationGetLatitude(location);
    }

    @SuppressLint("DefaultLocale")
    private String formatLocationGetLatitude(Location location) {
        if (location == null) {
            return "";
        }
        return String.format("%1$.4f",
                location.getLatitude()).replace(",", ".");


    }

    @SuppressLint("DefaultLocale")
    private String formatLocationGetLongitude(Location location) {
        if (location == null) {
            return "";
        }
        return String.format("%1$.4f",
                location.getLongitude()).replace(",", ".");
    }

}

