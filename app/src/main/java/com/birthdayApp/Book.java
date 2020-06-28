package com.birthdayApp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileDescriptor;
import java.io.IOException;

public class Book extends AppCompatActivity {

    private TextView textViewBook;
    private ImageView imageViewBook;
    public Button buttonBook;
    public Button buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        textViewBook = findViewById(R.id.book_text_view);
        imageViewBook = findViewById(R.id.imageViewBook);
        buttonBook = findViewById(R.id.buttonBook);
        buttonBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openURL(view);
            }
        });

        buttonNext = findViewById(R.id.book_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNext(view);
            }
        });
    }


    public void openURL(View view)
    {
        Uri uri = Uri.parse("https://www,gmail.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }


    public void openNext(View v) {
        Intent intent = new Intent(getApplicationContext(), Quiz1.class);
        startActivity(intent);

    }
}



