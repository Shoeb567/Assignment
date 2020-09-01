package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Set_3_Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_3__second);


        TextView firstname = (TextView)findViewById(R.id.firstname);
        TextView lastname = (TextView)findViewById(R.id.lastname);

        Bundle bundle = this.getIntent().getExtras();
        String val = bundle.getString("fname");
        String val1 = bundle.getString("lname");
        firstname.setText(val);
        lastname.setText(val1);

        final EditText no = (EditText)findViewById(R.id.no);
        Button submit = (Button)findViewById(R.id.submit);
        Button home = (Button)findViewById(R.id.home);
        final TextView reverce1 = (TextView)findViewById(R.id.reverce);
        final TextView odd = (TextView)findViewById(R.id.odd);
        final  TextView palindrome = (TextView)findViewById(R.id.palindrome);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer number = new StringBuffer(no.getText().toString());
                reverce1.setText("Reverse Number is:"+number.reverse());

               /* int reverse = 0;
                int number = Integer.parseInt(no.getText().toString());
                while(number != 0)
                {
                    reverse = reverse*10;
                    reverse = reverse + number%10;
                    number = number/10;

                }*/
                // reverce1.setText(reverse);

                int getNumber = Integer.parseInt(no.getText().toString());
                if(getNumber % 2 == 0)
                {
                    odd.setText("Number is Even");
                }
                else
                {
                    odd.setText("Number is Odd");
                }

                int i=0,reverse=0;
                int getpalindrome = Integer.parseInt(no.getText().toString());
                int q = getpalindrome;
                for(i=0; i <= getpalindrome ; i++)
                {
                    reverse = reverse * 10;
                    reverse = reverse+getpalindrome % 10;
                    getpalindrome = getpalindrome / 10;
                    i = 0;
                    if(reverse == q)
                    {
                        palindrome.setText("This is  Palindrome Number");
                    }
                    else
                    {
                        palindrome.setText("This is not Palindrome Number");
                    }
                }




            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_3_Second.this,Home.class);
                startActivity(iv);
            }
        });
    }
}
