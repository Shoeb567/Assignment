package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Set_6_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_6_first);


        final EditText firstname = (EditText)findViewById(R.id.fname);
        EditText lastname = (EditText)findViewById(R.id.lname);
        Button submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_6_first.this,Set_6_second.class);

                Bundle data = new Bundle();
                data.putString("fname",firstname.getText().toString());
                iv.putExtras(data);
                startActivity(iv);
            }
        });
    }
}
