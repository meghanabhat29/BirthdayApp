package com.birthdayApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Nalapaaka extends AppCompatActivity {
    CardView genasale, falafel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nalapaaka);

        genasale = findViewById(R.id.genasale);
        genasale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Genasale.class);
                startActivity(intent);
            }
        });

        falafel = findViewById(R.id.falafel);
        falafel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Falafel.class);
                startActivity(intent);
            }
        });

    }



}
