package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button set1 = (Button)findViewById(R.id.set1);
        Button set2 = (Button)findViewById(R.id.set2);
        Button set3 = (Button)findViewById(R.id.set3);
        Button set4 = (Button)findViewById(R.id.set4);
        Button set5 = (Button)findViewById(R.id.set5);
        Button set6 = (Button)findViewById(R.id.set6);
        Button set7 = (Button)findViewById(R.id.set7);
        Button set8 = (Button)findViewById(R.id.set8);
        Button set9 = (Button)findViewById(R.id.set9);
        Button set10 = (Button)findViewById(R.id.set10);

        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,MainActivity.class);
                startActivity(iv);
            }
        });
        set2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_2_first.class);
                startActivity(iv);
            }
        });
        set3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_3_first.class);
                startActivity(iv);
            }
        });
        set4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_4_first.class);
                startActivity(iv);
            }
        });
        set5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_5_first.class);
                startActivity(iv);
            }
        });
        set6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_6_first.class);
                startActivity(iv);
            }
        });


        set7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_7_first.class);
                startActivity(iv);
            }
        });

        set8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_8_first.class);
                startActivity(iv);
            }
        });

        set9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_9_first.class);
                startActivity(iv);
            }
        });

        set10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Home.this,Set_10_first.class);
                startActivity(iv);
            }
        });
    }
}
