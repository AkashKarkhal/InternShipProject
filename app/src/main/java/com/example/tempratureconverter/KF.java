package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KF extends AppCompatActivity {
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kf);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnkf  = findViewById(R.id.btnCKF);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText C = findViewById(R.id.KF);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView result = findViewById(R.id.Result);

        btnkf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(C.getText().toString());
                result0 = temp *(1.8-549.67);
                result.setText(String.valueOf(result0));

            }
        });
    }
}