package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Set_2_Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_2__second);

        Button home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_2_Second.this,Home.class);
                startActivity(iv);
            }
        });

        final Spinner sp1 = (Spinner) findViewById(R.id.sp1);
        //  final TextView tv1 = (TextView)findViewById(R.id.tv1);


        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)

            {

                switch (adapterView.getSelectedItem().toString()) {
                    case "1":
                        //Toast.makeText(getApplicationContext(),"70 Indian Rupee",Toast.LENGTH_SHORT).show();
                        // Toast.makeText(getApplicationContext(),adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
                        //tv1.setText("Answer");
                        // Toast.makeText(this,"your grade is " + spinner_text.getText(),Toast.LENGTH_SHORT).show();
                        Toast.makeText(getApplicationContext(), "Selected : " + sp1, Toast.LENGTH_SHORT).show();
                        //tv1.setText(sp1.getSelectedItem().toString());
                        break;
                    case "1.58 Japanese Yen":
                        Toast.makeText(getApplicationContext(),"1 Indian Rupee",Toast.LENGTH_SHORT).show();
                        break;
                    case "1 Kuwait Dina":
                        Toast.makeText(getApplicationContext(),"230 Indian Rupee",Toast.LENGTH_SHORT).show();
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }
}
