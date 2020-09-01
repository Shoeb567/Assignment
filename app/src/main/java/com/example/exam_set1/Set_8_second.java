package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Set_8_second extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_8_second);


        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mul = (Button) findViewById(R.id.mul);
        Button div = (Button) findViewById(R.id.div);

        Button home = (Button)findViewById(R.id.home);

        //final TextView resultfinal = (TextView)findViewById(R.id.resultfinal);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        home.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        final EditText no1 = (EditText)findViewById(R.id.no1);
        final EditText no2 = (EditText)findViewById(R.id.no2);
        final TextView answer = (TextView)findViewById(R.id.answer);


        int sum;

        switch (view.getId())
        {
            case R.id.add:
                int x = Integer.parseInt(no1.getText().toString());
                int y = Integer.parseInt(no2.getText().toString());
                sum= x+y;
                answer.setText("Addtion of "+x+"+"+y+"="+sum);
                break;

            case R.id.sub:
                int x1 = Integer.parseInt(no1.getText().toString());
                int y1 = Integer.parseInt(no2.getText().toString());
                sum= x1-y1;
                answer.setText("Substraction of "+x1+"-"+y1+"="+sum);
                break;


            case R.id.mul:
                int x2 = Integer.parseInt(no1.getText().toString());
                int y2 = Integer.parseInt(no2.getText().toString());
                sum= x2 * y2;
                answer.setText("Multiplication of "+x2+"*"+y2+"="+sum);
                break;

            case R.id.div:
                int x3 = Integer.parseInt(no1.getText().toString());
                int y3 = Integer.parseInt(no2.getText().toString());
                sum= x3 /y3;
                answer.setText("Division of "+x3+"*"+y3+"="+sum);
                break;

            case R.id.home:
                Intent iv1 = new Intent(Set_8_second.this,Home.class);
                startActivity(iv1);

        }


    }
}
