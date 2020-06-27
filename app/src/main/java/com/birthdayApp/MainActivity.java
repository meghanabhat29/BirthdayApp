package com.birthdayApp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.io.FileDescriptor;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewIntro;
    public Button buttonIntro;
    public Bitmap image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewIntro = findViewById(R.id.imageViewIntro);
        buttonIntro = findViewById(R.id.buttonIntro);
        buttonIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMemories(view);
            }
        });
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK && data != null ) {
            try {
                Uri uri = data.getData();
                ParcelFileDescriptor parcelFileDescriptor =
                        getContentResolver().openFileDescriptor(uri, "r");
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                parcelFileDescriptor.close();


            }
            catch(IOException e) {
                Log.e("bday","Image not found",e);
            }

        }
    }

    public void openMemories(View view)
    {
        Intent intent = new Intent(this,Disclaimer.class);
        startActivity(intent);
    }
}
