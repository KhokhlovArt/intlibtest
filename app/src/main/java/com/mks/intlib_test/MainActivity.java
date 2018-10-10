package com.mks.intlib_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mks.intlib.NotificationViewerGetter;
import com.mks.intlib.REST.RestServicer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new NotificationViewerGetter().getNotificationViewer(getApplicationContext()).init(getApplicationContext(), "publisherId", "Gaid", "appid", "sdkversion");
111
        new RestServicer().send(getApplicationContext(), true, getSupportLoaderManager(), "Start app", "test app start");
    }
}
