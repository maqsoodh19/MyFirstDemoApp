package com.example.maqso.myfirstdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_acticity);

        TextView tv1 = (TextView) findViewById(R.id.tv1);


        Intent intent = getIntent();
        String name = intent.getStringExtra("value");
         tv1.setText(name.toString());

        Log.d("TAG","Value "+ name);

    }
}
