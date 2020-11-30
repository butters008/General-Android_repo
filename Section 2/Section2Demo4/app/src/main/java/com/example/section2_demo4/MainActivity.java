package com.example.section2_demo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    public String name2 = "Testing";
//
//    public void buttonDemo4(View view){
//
//        EditText nameID = findViewById(R.id.nameID);
//
//        Log.i("Name: ", nameID.getText().toString());
//        Log.i("Name: ", name2);
//
//        Toast.makeText(MainActivity.this, "Hi there! " + nameID.getText().toString(), Toast.LENGTH_SHORT).show();
//    }

    public void changePicDemo(View view){
        ImageView picture = findViewById(R.id.imageView);

        picture.setImageResource(R.drawable.cow);

        Toast.makeText(MainActivity.this, "Picture has changed!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}