package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Set_10_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_10_second);


        final EditText celsius = (EditText)findViewById(R.id.celsius);
        Button getSubmit = (Button)findViewById(R.id.getSubmit);
        final TextView answer1 = (TextView)findViewById(R.id.answer1);
        final TextView answer2 = (TextView)findViewById(R.id.answer2);
        Button home = (Button)findViewById(R.id.home);


        getSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float celsius1 = Float.parseFloat(celsius.getText().toString());
                float F = celsius1 * (9f /5) +32;

                answer1.setText("Celsius to Fahrenheit:"+F);

                float kelvin = Float.parseFloat(celsius.getText().toString());
                float K = kelvin + 273;

                answer2.setText("Celsius to Kelvin:"+K);


            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_10_second.this,Home.class);
                startActivity(iv);
            }
        });
    }
}
