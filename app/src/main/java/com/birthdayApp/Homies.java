package com.birthdayApp;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Homies extends AppCompatActivity {

    ImageView homies;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homies);
        homies = findViewById(R.id.imageViewhomies);
        homiesAnimation();
        play();

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
}
