package com.birthdayApp;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Homies extends AppCompatActivity {

    ImageView homies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homies);
        homies = findViewById(R.id.imageViewhomies);
        homiesAnimation();

    }

    public void homiesAnimation()
    {
        homies.setVisibility(View.VISIBLE);
        homies.setImageResource(R.drawable.homies_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) homies.getDrawable();
        correctAnimation.start();
    }
}
