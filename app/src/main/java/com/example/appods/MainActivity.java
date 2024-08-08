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




        ImageButton btn1 = findViewById(R.id.ods1);
        ImageButton btn2 = findViewById(R.id.ods2);
        ImageButton btn3 = findViewById(R.id.ods3);
        ImageButton btn4 = findViewById(R.id.ods4);
        ImageButton btn5 = findViewById(R.id.ods5);
        ImageButton btn6 = findViewById(R.id.ods6);
        ImageButton btn7 = findViewById(R.id.ods7);
        ImageButton btn8 = findViewById(R.id.ods8);
        ImageButton btn9 = findViewById(R.id.ods9);
        ImageButton btn10 = findViewById(R.id.ods10);
        ImageButton btn11 = findViewById(R.id.ods11);
        ImageButton btn12 = findViewById(R.id.ods12);
        ImageButton btn13 = findViewById(R.id.ods13);
        ImageButton btn14 = findViewById(R.id.ods14);
        ImageButton btn15 = findViewById(R.id.ods15);
        ImageButton btn16 = findViewById(R.id.ods16);
        ImageButton btn17 = findViewById(R.id.ods17);

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