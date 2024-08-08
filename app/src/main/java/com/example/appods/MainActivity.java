package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ImageView btn1 = findViewById(R.id.ods1);
        ImageView btn2 = findViewById(R.id.ods2);
        ImageView btn3 = findViewById(R.id.ods3);
        ImageView btn4 = findViewById(R.id.ods4);
        ImageView btn5 = findViewById(R.id.ods5);
        ImageView btn6 = findViewById(R.id.ods6);
        ImageView btn7 = findViewById(R.id.ods7);
        ImageView btn8 = findViewById(R.id.ods8);
        ImageView btn9 = findViewById(R.id.ods9);
        ImageView btn10 = findViewById(R.id.ods10);
        ImageView btn11 = findViewById(R.id.ods11);
        ImageView btn12 = findViewById(R.id.ods12);
        ImageView btn13 = findViewById(R.id.ods13);
        ImageView btn14 = findViewById(R.id.ods14);
        ImageView btn15 = findViewById(R.id.ods15);
        ImageView btn16 = findViewById(R.id.ods16);
        ImageView btn17 = findViewById(R.id.ods17);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaods1 = new Intent( getApplicationContext(), ods1Activity.class);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaods2 = new Intent( getApplicationContext(), ods2Activity.class);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaods3 = new Intent( getApplicationContext(), ods3Activity.class);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaods4 = new Intent( getApplicationContext(), ods4Activity.class);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaods5 = new Intent( getApplicationContext(), ods5Activity.class);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaods6 = new Intent( getApplicationContext(), ods6Activity.class);
            }
        });
    }
}