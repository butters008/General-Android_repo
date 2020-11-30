package com.example.section2_demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void button3Demo(View view){

        EditText userID = findViewById(R.id.userID);
        EditText passID = findViewById(R.id.passID);

        Log.i("button", userID.getText().toString());
        Log.i("button", passID.getText().toString());

        Toast.makeText(MainActivity.this, "Hi there! " + userID.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}