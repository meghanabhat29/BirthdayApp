package com.birthdayApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Memories extends AppCompatActivity {

    ImageView Bhakti, Deepak, Meghana, Neehar, Nishan, Sharath, Vivek;
    TextView tBhakti, tDeepak, tMeghana, tNeehar, tNishan, tVivek;
    ImageView tSharath, tSharath2;

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
        Vivek = findViewById(R.id.imageViewVivek);
        tBhakti = findViewById(R.id.textViewBhakti);
        tDeepak = findViewById(R.id.textViewDeepak);
        tMeghana = findViewById(R.id.textViewMeghana);
        tNeehar = findViewById(R.id.textViewNeehar);
        tNishan = findViewById(R.id.textViewNishan);
        tSharath = findViewById(R.id.SharathPoem);
        tSharath2 = findViewById(R.id.SharathPoem2);
        tVivek = findViewById(R.id.textViewVivek);

        BhaktiAnimation();
        DeepakAnimation();
        MeghanaAnimation();
        NeeharAnimation();
        NishanAnimation();
        SharathAnimation();
        VivekAnimation();

    }

    public void BhaktiAnimation()
    {
        Bhakti.setVisibility(View.VISIBLE);
        tBhakti.setText("Our old man turns 22, it's funny how you act either like a 5 year old or a 50 year old and there's no in between. Sweet, smart, loving, caring … yes I know you're 'Shaadi material’ and yes I will spread the word. For someone giving life advice and getting stuck in a turnstile gate you sure do have contrasting personality traits. You're smart enough to understand the theory of relativity but you don't know where the boomerang option is on Instagram. You were so quiet when I met you and now you never shut up. \n" +
                "Thank you, love you and all that sappy stuff, you know it's not us, so let me just skip it. Happy, happy birthday and hope you find everything that you're looking for this year. Count all your blessings everyday and don't ever forget to acknowledge the most important one, which is you. :')");
        Bhakti.setImageResource(R.drawable.bhakti_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Bhakti.getDrawable();
        correctAnimation.start();
    }

    public void DeepakAnimation()
    {
        Deepak.setVisibility(View.VISIBLE);
        tDeepak.setText("Happy birthday!!\n" +
                "Just one more year in the college it's gonna be over very soon. Let's enjoy it as best as we can.\n" +
                "Many more unplanned trips and crazy discussions there.\n" +
                "Let's hope we all go on trips even after college.\n" +
                "From doing IEEE projects to teasing Sharath and explaining about his love life\uD83D\uDE02\n" +
                "We have come a long way and grown so much.\n" +
                "To all the late nights cooking in your place and vivek's comedies and Nishan's laughs\n" +
                "Wish for something really crazy as this year is really taking unexpected turns so much.\n" +
                "U never know what might happen next\n" +
                "Wishing all the good for your future.!\n" +
                "\n");
        Deepak.setImageResource(R.drawable.deepak_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Deepak.getDrawable();
        correctAnimation.start();
    }

    public void MeghanaAnimation()
    {
        Meghana.setVisibility(View.VISIBLE);
        tMeghana.setText("Happy birthday Manish.I hope you have an amazing life ahead and may it be everything that you want it to be.\n\n I've written a poem for you.Read it.If you already have, I hope it made you smile.");
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
        tNeehar.setText("Many many happy returns of the day Manish!!\n" +
                "It's been almost three years since we've known each other and man, we've really come a long way. Infact, you've been an integral part of all my prominent memories which I'm going to treasure all my life.\n" +
                "I really don't know when the two of us really clicked, probably because it happened so naturally. \n" +
                "Out of all the people in my life, I can relate myself the most with you. From our taste in music to our approach towards lab records\uD83D\uDE02, from rooting for MI to the love for Java, from exploring new places to jumping in a deep sea without jacket, we've a lot in common and it's always great to have like-minded individuals around.\n" +
                "\n" +
                "I don't think I've ever told you what you mean to me so let me put it out now\n" +
                "For me, you are someone who's willing to jump off a cliff with me just for the sake of it.\n" +
                "For me, you are someone with whom exploring new things and in turn, exploring myself feels simpler.\n" +
                "For me, you're someone who not only supports me in every way, but also is ready to walk through the woods with me, holding a lamp.\n" +
                "For me, you are special.\n" +
                "For someone as special as you, the sky's the limit would be an understatement. For someone as special as you, you're ought to walk a merry way and leave behind a legacy of your own.\n" +
                "Wishing you the very best for your future endeavours!");
    }

    public void NishanAnimation()
    {
        Nishan.setVisibility(View.VISIBLE);
        Nishan.setImageResource(R.drawable.nishan_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Nishan.getDrawable();
        correctAnimation.start();
        tNishan.setText("Manish, The name says it all. \"The God of the mind\". No other words are required to describe him. Happy Birthday Manish Kumar!!");
    }

    public void SharathAnimation()
    {
        Sharath.setVisibility(View.VISIBLE);
        Sharath.setImageResource(R.drawable.sharath_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Sharath.getDrawable();
        correctAnimation.start();
    }

    public void VivekAnimation()
    {
        Vivek.setVisibility(View.VISIBLE);
        Vivek.setImageResource(R.drawable.vivek_memories);
        final AnimationDrawable correctAnimation = (AnimationDrawable) Vivek.getDrawable();
        correctAnimation.start();
        tVivek.setText("h>j");
    }


}

