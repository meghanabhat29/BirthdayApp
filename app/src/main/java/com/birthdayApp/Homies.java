package com.birthdayApp;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Homies extends AppCompatActivity {

    ImageView homies;
    MediaPlayer player;
    Button buttonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homies);
        homies = findViewById(R.id.imageViewhomies);
        homiesAnimation();
        play();

        buttonNext = findViewById(R.id.button_nextHomies);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNext(view);
            }
        });

    }

    public void homiesAnimation()
    {
        homies.setVisibility(View.VISIBLE);
        homies.setImageResource(R.drawable.homies_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) homies.getDrawable();
        correctAnimation.start();
    }

    public void play()
    {
        if(player==null)
            player = MediaPlayer.create(this,R.raw.haan_main_galat);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayer();
            }
        });
    }

    private void stopPlayer()
    {
        if(player!=null)
            player.release();
        player=null;
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }

    public void openNext(View view) {
        Intent intent = new Intent(getApplicationContext(), Quiz4.class);
        startActivity(intent);
    }
}
