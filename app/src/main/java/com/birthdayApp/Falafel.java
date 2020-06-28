package com.birthdayApp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Falafel extends AppCompatActivity {

    TextView FalfelText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falafel);

        FalfelText = findViewById(R.id.falafel_text);
        FalfelText.setVisibility(View.VISIBLE);
    }
}