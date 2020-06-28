package com.birthdayApp;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ItMe extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itme);
        VideoView videoView = (VideoView) findViewById(R.id.videoViewItme);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.itme_video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        play();


    }

    public void play()
    {
        if(player==null)
            player = MediaPlayer.create(this,R.raw.itme_audio);
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
