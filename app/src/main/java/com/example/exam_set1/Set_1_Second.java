package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Set_1_Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_1__second);


        TextView firstname = (TextView)findViewById(R.id.firstname);
        TextView lastname = (TextView)findViewById(R.id.lastname);

        final EditText value1 = (EditText)findViewById(R.id.value1);
        final EditText value2 = (EditText)findViewById(R.id.value2);
        Button submit = (Button)findViewById(R.id.submit);
        final TextView sgpa = (TextView)findViewById(R.id.sgpa);
        final TextView cgpa = (TextView)findViewById(R.id.cgpa);
        final TextView per = (TextView)findViewById(R.id.per);
        Button home = (Button)findViewById(R.id.home);

        Bundle bundle = this.getIntent().getExtras();
        String val = bundle.getString("fname");
        String val1 = bundle.getString("lname");
        firstname.setText(val);
        lastname.setText(val1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double no1 = Double.parseDouble(value1.getText().toString());
                Double no2 = Double.parseDouble(value2.getText().toString());

                Double sgpaAnswer = no1 / no2;
                sgpa.setText("SGPA::"+sgpaAnswer);

                Double no3 = sgpaAnswer/2;
                cgpa.setText("CGPA is::"+no3);

                Double no4 = no3*10;
                per.setText("Percentage is::"+no4+"%");

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_1_Second.this,Home.class);
                startActivity(iv);
            }
        });
    }
}
