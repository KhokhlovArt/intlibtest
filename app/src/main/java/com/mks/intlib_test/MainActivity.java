package com.mks.intlib_test;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mks.intlib.NotificationViewerGetter;
import com.mks.intlib.REST.RestServicer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new NotificationViewerGetter().getNotificationViewer(getApplicationContext()).init(getApplicationContext(), "publisherId", "Gaid", "appid", "sdkversion", "com.mks.delete_me,sdasd.sdds.sss");


        new RestServicer().send(getApplicationContext(), true, getSupportLoaderManager(), "Start app", "test app start");

      new NotificationViewerGetter().getNotificationViewer(getApplicationContext()).subscribeToTopic(getApplicationContext(), "install");
       // new NotificationViewerGetter().getNotificationViewer(getApplicationContext()).unsubscribeFromTopic(getApplicationContext(), "install");

    }


}
