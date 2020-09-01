package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Set_9_first extends AppCompatActivity {
    ArrayList<String> myfnamearray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_9_first);


        myfnamearray = new ArrayList<>();

        final EditText firstname = (EditText)findViewById(R.id.firstname);
        final EditText lastname = (EditText)findViewById(R.id.lastname);
        Button submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_9_first.this,Set_9_second.class);
                Bundle data = new Bundle();
                data.putString("firstname",firstname.getText().toString());

                myfnamearray.add(lastname.getText().toString());
                data.putStringArrayList("lastname",myfnamearray);

                iv.putExtras(data);
                startActivity(iv);

            }
        });
    }
}
