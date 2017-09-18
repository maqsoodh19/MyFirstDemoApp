package com.example.maqso.myfirstdemoapp;

import android.content.ComponentName;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onstRT");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"REsume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"pause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Stop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG,"Dstroy method");
    }
}
