package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CK extends AppCompatActivity {
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ck);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnCk = findViewById(R.id.btnCk);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText C = findViewById(R.id.Ck);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView result = findViewById(R.id.Resultk);

        btnCk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp = Double.parseDouble(C.getText().toString());
                result0 = (temp)+273;
                result.setText(String.valueOf(result0));

            }
        });
    }
}