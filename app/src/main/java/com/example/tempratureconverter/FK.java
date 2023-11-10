package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FK extends AppCompatActivity {
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fk);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnCk = findViewById(R.id.btnCFk);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText C = findViewById(R.id.Fk);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView result = findViewById(R.id.ResultFk);


        btnCk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(C.getText().toString());
                result0 = (temp-32)/1.8+273.15;                //Kelvin (K) = (Fahrenheit - 32) / 1.8 + 273.15
                result.setText(String.valueOf(result0));

            }
        });
    }
}