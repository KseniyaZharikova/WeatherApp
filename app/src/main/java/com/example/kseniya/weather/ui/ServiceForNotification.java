package com.example.kseniya.weather.ui;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

import com.example.kseniya.weather.R;
import com.example.kseniya.weather.modelsDayCurrentWeather.CurrentModel;

public class ServiceForNotification extends Service {
    GetService getService = new GetService();

    @Override
    public void onCreate() {
        super.onCreate();
        Intent intent = new Intent(this, ActivityBishkek.class);
        PendingIntent pendingIntent = PendingIntent.getActivity
                (this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.logo_weather)
                .setContentTitle("Погода")
                .setContentIntent(pendingIntent);
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        assert manager != null;
        manager.notify(0, builder.build());

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return getService;
    }

    class GetService extends Binder {
        ServiceForNotification myService() {
            return ServiceForNotification.this;
        }
    }
}