package com.example.maqso.myfirstdemoapp;

import android.content.ComponentName;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);

        // explicit Intetn
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText name = (EditText) findViewById(R.id.editText);
//                String myName = name.getText().toString();
//
//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("value", myName);
//                startActivity(intent);
//
//            }
//        });

        // Implicit Intent
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                EditText value = (EditText) findViewById(R.id.editText);
//                String phoneNo = value.getText().toString();

                Intent intent = new Intent();
                intent.setAction(intent.ACTION_DIAL);
                intent.putExtra("number","tel:0320887878");
                startActivity(intent);
            }
        });

    }


}
