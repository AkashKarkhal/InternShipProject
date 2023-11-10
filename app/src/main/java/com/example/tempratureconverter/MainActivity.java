package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CF = findViewById(R.id.CF);
        Button CK = findViewById(R.id.CK);
        Button FK = findViewById(R.id.FK);
        Button KF = findViewById(R.id.KF);

        CF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CF.class);
                startActivity(intent);
            }
        });

        CK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CK.class);
                startActivity(intent);
            }
        });

        FK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FK.class);
                startActivity(intent);
            }
        });

        KF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KF.class);
                startActivity(intent);
            }
        });




    }

}