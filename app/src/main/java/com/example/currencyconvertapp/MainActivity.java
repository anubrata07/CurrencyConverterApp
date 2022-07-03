package com.example.currencyconvertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, dollar, pound, yen, dinar, bitcoin, rubel, aus, can;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.euro);
        dollar=findViewById(R.id.dollar);
        pound= findViewById(R.id.pound);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel=findViewById(R.id.rubel);
        aus=findViewById(R.id.aus);
        can=findViewById(R.id.can);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if(TextUtils.isEmpty(z)){
                    editText.setError("Empty User Input");
                }else{
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);

                    Formatter formatter=new Formatter();

                    k=n * 0.012;
                    DecimalFormat numberFormat= new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

//                    textView.setText(""+k);
                }
            }
        });



    }
}