package com.example.section4demo2_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView  image = findViewById(R.id.imageView);

        //This is for simple fade in or out animation
//        ImageView  image2 = findViewById(R.id.imageView2);
//        image.animate().alpha(0f).setDuration(2000);
//        image2.animate().alpha(1f).setDuration(2000);


        // Moving off the screen
        //Moves up (-) or down (+)
        image.animate().translationYBy(1000f).setDuration(2000);
        //Moves left (-) or right (+)
//        image.animate().translationXBy(1000f).setDuration(2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}