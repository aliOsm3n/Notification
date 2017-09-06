package com.example.aliothman.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     int notid =0;
    public void btnpress(View view) {
//        NotificationCompat.Builder builder =new NotificationCompat.Builder(MainActivity.this);
//        builder.setContentTitle("Its Danger")
//                .setContentText("if you go to in 4 pm the way can be dangre")
//                .setSmallIcon(R.mipmap.ic_launcher);
//
//
//        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        notificationManager.notify(notid,builder.build());
//        notid++;
        NewMessageNotification newMessageNotification  = new NewMessageNotification();
        newMessageNotification.notify(MainActivity.this,"Danger",1);
    }
}
