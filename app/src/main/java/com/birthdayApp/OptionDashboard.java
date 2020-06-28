package com.birthdayApp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import androidx.cardview.widget.CardView;



public class OptionDashboard extends AppCompatActivity {

    CardView M,A,N,I,S,H;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        M = findViewById(R.id.optionm);
        A = findViewById(R.id.optiona);
        N = findViewById(R.id.optionn);
        I = findViewById(R.id.optioni);
        S = findViewById(R.id.options);
        H = findViewById(R.id.optionh);

        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Memories.class);
                startActivity(intent);
            }
        });

        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ItMe.class);
                startActivity(intent);
            }
        });

        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Book.class);
                startActivity(intent);
            }
        });

        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Homies.class);
                startActivity(intent);
            }
        });



    }
}
