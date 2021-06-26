package com.example.senddatabetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    TextView emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        emailText = findViewById(R.id.putEmail);

        //getting data(extras) from intent
        Intent i = getIntent();
        String getEmail = i.getStringExtra("email");


        emailText.setText(getEmail);
        Log.i("Did it word", emailText.toString());

    }
}