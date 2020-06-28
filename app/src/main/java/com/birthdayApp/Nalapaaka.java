package com.birthdayApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Nalapaaka extends AppCompatActivity {
    CardView genasale;
    public Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalapaaka);

        genasale = findViewById(R.id.genasale);
        genasale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Genasale.class);
                startActivity(intent);
            }
        });

        buttonNext = findViewById(R.id.buttonBook);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNext(view);
            }
        });

    }


    public void openNext(View view) {
        Intent intent = new Intent(getApplicationContext(), Quiz2.class);
        startActivity(intent);
    }


}
