package com.example.maqso.myfirstdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        TextView textView = (TextView) findViewById(R.id.name);
//        textView.setText(name.toString());

        Intent intent = getIntent();
        String name = intent.getStringExtra("number");


        Log.d("TAG","Value "+ name);

    }
}
