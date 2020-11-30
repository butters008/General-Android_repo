package com.example.section2_demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void function2(View view){
//        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField = findViewById(R.id.myTextField);
        

        Log.i("button", myTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}