package com.birthdayApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Genasale extends AppCompatActivity {

    TextView genasaleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genasale);

        genasaleText = findViewById(R.id.genasale_text);
        genasaleText.setVisibility(View.VISIBLE);
    }
}
