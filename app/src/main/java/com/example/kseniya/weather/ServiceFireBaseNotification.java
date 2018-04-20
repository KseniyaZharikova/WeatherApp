package com.example.kseniya.weather;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Binder;
import android.support.v4.app.NotificationCompat;

import com.example.kseniya.weather.ui.ActivityBishkek;
import com.google.firebase.messaging.FirebaseMessagingService;

public class ServiceFireBaseNotification extends FirebaseMessagingService{
    GetService getService = new GetService();

    @Override
    public void onCreate() {
        super.onCreate();
        Intent intent = new Intent(this, ActivityBishkek.class);
        PendingIntent pendingIntent = PendingIntent.getActivity
                (this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Title")
                .setContentIntent(pendingIntent);
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        assert manager != null;
        manager.notify(0, builder.build());

    }



    class GetService extends Binder {
        ServiceFireBaseNotification myService() {
            return ServiceFireBaseNotification.this;
        }
    }
}