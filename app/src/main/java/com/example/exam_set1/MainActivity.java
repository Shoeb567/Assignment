package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText id = (EditText)findViewById(R.id.id);
        final EditText fname = (EditText)findViewById(R.id.fname);
        final EditText lname = (EditText)findViewById(R.id.lname);
        Button submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(MainActivity.this,Set_1_Second.class);
                Bundle data = new Bundle();
                data.putString("fname",fname.getText().toString());
                data.putString("lname",lname.getText().toString());
                iv.putExtras(data);
                startActivity(iv);
            }
        });


    }
}
