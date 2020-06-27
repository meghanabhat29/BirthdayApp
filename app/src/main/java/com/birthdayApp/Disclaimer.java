package com.birthdayApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.CountDownTimer;

public class Disclaimer extends AppCompatActivity {

    private TextView textViewDisclaimer;
    private ImageView imageViewDisclaimer;
    private static final long START_TIME_IN_ms = 60000;
    private CountDownTimer countDownTimer;
    private boolean timerRunning = true;
    private long timeLeft; // in milliseconds


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
        startTimer();

        textViewDisclaimer = findViewById(R.id.text_disclaimer);
        imageViewDisclaimer = findViewById(R.id.image_disclaimer);

    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeft, 1000) {
            @Override
            public void onTick(long l) {
                timeLeft = l;

            }

            @Override
            public void onFinish() {
                timerRunning = false;
                Intent disIntent = new Intent(Disclaimer.this, A.class);
                startActivity(disIntent);
            }
        };
    }


}
