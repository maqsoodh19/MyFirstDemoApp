package com.example.maqso.myfirstdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class first_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);


        Button btn1 = (Button) findViewById(R.id.btn1);

        // explicit Intetn
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText)  findViewById(R.id.edt1);
                String myName = name.getText().toString();

                Intent intent = new Intent(first_activity.this,second_activity.class);
                intent.putExtra("value", myName);
                startActivity(intent);

            }
        });

        // Implicit Intent
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText value = (EditText) findViewById(R.id.editText);
//                String phoneNo = value.getText().toString();
//
//                Intent intent = new Intent();
//                intent.setAction(intent.ACTION_DIAL);
//                intent.putExtra("number","tel:0320887878");
//                startActivity(intent);
//            }
//        });

    }


}
