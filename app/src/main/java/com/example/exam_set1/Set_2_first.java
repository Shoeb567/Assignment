package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Set_2_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_2_first);
        final EditText username = (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);
        Button submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Shoeb") && password.getText().toString().equals("1234"))
                {
                    Intent iv = new Intent(Set_2_first.this,Set_2_Second.class);
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
