package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Set_7_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_7_second);


        final EditText no = (EditText)findViewById(R.id.no);
        final TextView odd = (TextView) findViewById(R.id.odd);
        final TextView prime = (TextView)findViewById(R.id.prime);
        final TextView sum1 = (TextView)findViewById(R.id.sum);
        Button submit = (Button)findViewById(R.id.submit);
        Button home = (Button)findViewById(R.id.home);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Condition One(Odd Even)
                int no1 = Integer.parseInt(no.getText().toString());
                if(no1 %2 == 0)
                {
                    odd.setText("Number is Even");
                }
                else
                {
                    odd.setText("Number is Odd");
                }


                //Condition 2 () Prime Number or Not

                double number = Double.parseDouble(no.getText().toString());
                int f=0;
                for(int i=2; i<number; i++)
                {
                    if(number % i == 0)
                        f = 1;
                }
                if(f == 0)
                {
                    prime.setText("Prime Number");
                }
                else {
                    prime.setText("Not a Prime Number");
                }



                //Condition 3 () Sum of Digits
                long sum;
                long n = Long.parseLong(no.getText().toString());
                for(sum=0; n!=0; n/=10)
                {
                    sum+= n%10;
                }
                sum1.setText("Sum of all digits is:"+sum);


            }



        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_7_second.this,Home.class);
                startActivity(iv);
            }
        });
    }
}
