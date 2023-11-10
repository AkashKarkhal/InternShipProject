package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CF extends AppCompatActivity {
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cf);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnC = findViewById(R.id.btnC);
        EditText C = findViewById(R.id.C);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView result = findViewById(R.id.Result);



        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double temp = Double.parseDouble(C.getText().toString());
               result0 = (temp * 1.8)+32;
               result.setText(String.valueOf(result0));

            }
        });


    }
}