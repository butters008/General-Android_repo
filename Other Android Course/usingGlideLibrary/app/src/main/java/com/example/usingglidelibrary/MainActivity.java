package com.example.usingglidelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);

        //Using glide library to load and display images
        //Got it working locally on phone and not with AVD
        Glide.with(this).load("https://static.thenounproject.com/png/1387590-200.png").into(image);
    }
}