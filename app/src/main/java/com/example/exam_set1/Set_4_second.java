package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class Set_4_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_4_second);

        Spinner sp1 = (Spinner)findViewById(R.id.sp1);
        Button home = (Button)findViewById(R.id.home);



        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (adapterView.getSelectedItem().toString()) {
                    case "Black":
                        view.getRootView().setBackgroundColor(Color.BLACK);
                        break;
                    case "Yellow":
                        view.getRootView().setBackgroundColor(Color.YELLOW);
                        break;
                    case "Red":
                        view.getRootView().setBackgroundColor(Color.RED);
                        break;
                    case "Blue":
                        view.getRootView().setBackgroundColor(Color.BLUE);
                        break;
                    case "Grey":
                        view.getRootView().setBackgroundColor(Color.GRAY);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_4_second.this,Home.class);
                startActivity(iv);
            }
        });
    }
}
