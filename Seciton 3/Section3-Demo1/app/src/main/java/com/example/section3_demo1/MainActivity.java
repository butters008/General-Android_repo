package com.example.section3_demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNum;

    public void newRandom(){
        Random rand = new Random();
        randomNum = rand.nextInt(20)+1;
    }

    public void makeToast (String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void newCalc(View view){
        EditText numberGuessed = findViewById(R.id.guess_number);
        Log.i("Button Pushed", numberGuessed.getText().toString());

        Integer numGuessInt = Integer.parseInt(numberGuessed.getText().toString());

        if(numGuessInt < randomNum){
            makeToast("higher");
        }
        else if(numGuessInt > randomNum){
            makeToast("lower");
        }
        else{
            makeToast("correct - choose a new number");
            newRandom();

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newRandom();
    }
}