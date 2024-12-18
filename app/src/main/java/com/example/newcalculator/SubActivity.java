package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;
    TextView t1;

    String getNum1,getNum2,result;
    int num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        e1=(EditText) findViewById(R.id.sn1);
        e2=(EditText) findViewById(R.id.sn2);

        t1=(TextView) findViewById(R.id.resToDisp1);
        b1=(Button) findViewById(R.id.subb);
        b2=(Button) findViewById(R.id.go2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=e1.getText().toString();
                getNum2=e2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1-num2;
                result=String.valueOf(sum);
                t1.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob2);
            }
        });
    }
}