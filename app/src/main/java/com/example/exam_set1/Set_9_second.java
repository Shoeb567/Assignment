package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Set_9_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_9_second);

        TextView lbl = (TextView)findViewById(R.id.lbl);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);

        Button home = (Button)findViewById(R.id.home);
        Bundle bundle = this.getIntent().getExtras();
        String val = bundle.getString("firstname");
        lbl.setText(val);

        ArrayList<String> myfnamearray1 = bundle.getStringArrayList("lastname");

        ArrayAdapter<String> arr1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,myfnamearray1);
        spinner.setAdapter(arr1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_9_second.this,Home.class);
                startActivity(iv);
            }
        });

    }
}
