package com.example.exam_set1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Set_5_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_5_second);

        TextView lbl = (TextView)findViewById(R.id.lbl);
        Bundle bundle = this.getIntent().getExtras();
        String val = bundle.getString("username");
        lbl.setText(val);

        final EditText bs = (EditText)findViewById(R.id.bs);
        final EditText gp = (EditText)findViewById(R.id.gp);
        final EditText hra = (EditText)findViewById(R.id.hra);
        final  EditText da = (EditText)findViewById(R.id.da);
        final EditText medical = (EditText)findViewById(R.id.medical);
        final EditText ta = (EditText)findViewById(R.id.ta);

        final TextView answer= (TextView)findViewById(R.id.answer);
        Button submit = (Button)findViewById(R.id.submit);
        Button home = (Button)findViewById(R.id.home);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int bs1 = Integer.parseInt(bs.getText().toString());
                int gp1 = Integer.parseInt(gp.getText().toString());
                int hra1 = Integer.parseInt(hra.getText().toString());
                int da1 = Integer.parseInt(da.getText().toString());
                int medical1 = Integer.parseInt(medical.getText().toString());
                int ta1 = Integer.parseInt(ta.getText().toString());
                float finalhra =  hra1 % 35;
                float finalda = da1 % 80;

                float sum = bs1 + gp1 + finalhra +finalda + medical1 + ta1;
                answer.setText("Total Salary is::"+sum);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv = new Intent(Set_5_second.this,Home.class);
                startActivity(iv);
            }
        });
    }
}
