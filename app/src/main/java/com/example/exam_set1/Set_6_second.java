package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Set_6_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_6_second);


        TextView lbl = (TextView)findViewById(R.id.lbl);
        Bundle bundle = this.getIntent().getExtras();
        String val = bundle.getString("fname");
        lbl.setText(val);

        final EditText mark1 = (EditText)findViewById(R.id.mark1);
        final EditText mark2 = (EditText)findViewById(R.id.mark2);
        final EditText mark3 = (EditText)findViewById(R.id.mark3);
        final EditText mark4 = (EditText)findViewById(R.id.mark4);
        final EditText mark5 = (EditText)findViewById(R.id.mark5);
        final Button answer = (Button)findViewById(R.id.answer);
        final TextView total = (TextView)findViewById(R.id.total);
        final TextView pass = (TextView)findViewById(R.id.pass);
        final TextView per= (TextView)findViewById(R.id.per);

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(mark1.getText().toString());
                int no2 = Integer.parseInt(mark2.getText().toString());
                int no3 = Integer.parseInt(mark3.getText().toString());
                int no4 = Integer.parseInt(mark4.getText().toString());
                int no5 = Integer.parseInt(mark5.getText().toString());
                float sum=0;
                if(no1  < 100 && no2<100 && no3<100 && no4<100 && no5<100 )
                {
                    sum =no1+no2+no3+no4+no5;
                    total.setText("Sum is="+sum);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Enter Marks in 100 weightage",Toast.LENGTH_SHORT).show();
                }
                float percentage =  sum/5;
                per.setText("Percentage is="+percentage+"%");

                if (percentage < 50)
                {
                    pass.setText("Student is Fail");
                }
                else
                {
                    pass.setText("Student is Pass");
                }



            }
        });

        Button home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_6_second.this,Home.class);
                startActivity(iv);
            }
        });

    }
}
