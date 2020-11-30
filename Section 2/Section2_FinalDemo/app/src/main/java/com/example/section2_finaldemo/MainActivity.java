package com.example.section2_finaldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view){
        EditText dollarAmount = (EditText) findViewById(R.id.numberOutput);

        Double dollarAmountDouble = Double.parseDouble(dollarAmount.getText().toString());
        Double poundAmount = dollarAmountDouble * .75;
        Toast.makeText(MainActivity.this, String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show();
        Log.i("Amount: US", dollarAmount.getText().toString());
        Log.i("Amount: UK", poundAmount.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}