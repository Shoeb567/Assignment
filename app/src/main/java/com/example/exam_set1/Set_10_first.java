package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Set_10_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_10_first);


        final EditText no1 = (EditText)findViewById(R.id.no1);
        final EditText no2 = (EditText)findViewById(R.id.no2);
        Button submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(no1.getText().toString());
                int number2 = Integer.parseInt(no2.getText().toString());
                //number2 = number1 * number1;
                if(number2 == number1*number1*number1)
                {
                    Intent iv = new Intent(Set_10_first.this,Set_10_second.class);
                    startActivity(iv);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid Login",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
