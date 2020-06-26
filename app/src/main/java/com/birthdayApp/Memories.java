package com.birthdayApp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Memories extends AppCompatActivity {

    ImageView Bhakti, Deepak, Meghana, Neehar, Nishan, Sharath;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memories);

        Bhakti = findViewById(R.id.imageViewBhakti);
        Deepak = findViewById(R.id.imageViewDeepak);
        Meghana = findViewById(R.id.imageViewMeghana);
        Neehar = findViewById(R.id.imageViewNeehar);
        Nishan = findViewById(R.id.imageViewNishan);
        Sharath = findViewById(R.id.imageViewSharath);

        BhaktiAnimation();
        DeepakAnimation();
        MeghanaAnimation();
        NeeharAnimation();
        NishanAnimation();
        SharathAnimation();
    }

    public void BhaktiAnimation()
    {
        Bhakti.setVisibility(View.VISIBLE);
        Bhakti.setImageResource(R.drawable.bhakti_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Bhakti.getDrawable();
        correctAnimation.start();
    }

    public void DeepakAnimation()
    {
        Deepak.setVisibility(View.VISIBLE);
        Deepak.setImageResource(R.drawable.deepak_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Deepak.getDrawable();
        correctAnimation.start();
    }

    public void MeghanaAnimation()
    {
        Meghana.setVisibility(View.VISIBLE);
        Meghana.setImageResource(R.drawable.meghana_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Meghana.getDrawable();
        correctAnimation.start();
    }

    public void NeeharAnimation()
    {
        Neehar.setVisibility(View.VISIBLE);
        Neehar.setImageResource(R.drawable.neehar_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Neehar.getDrawable();
        correctAnimation.start();
    }

    public void NishanAnimation()
    {
        Nishan.setVisibility(View.VISIBLE);
        Nishan.setImageResource(R.drawable.nishan_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Nishan.getDrawable();
        correctAnimation.start();
    }

    public void SharathAnimation()
    {
        Sharath.setVisibility(View.VISIBLE);
        Sharath.setImageResource(R.drawable.sharath_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Sharath.getDrawable();
        correctAnimation.start();
    }
}

