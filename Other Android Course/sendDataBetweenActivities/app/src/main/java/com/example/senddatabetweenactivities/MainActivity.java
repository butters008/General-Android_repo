package com.example.senddatabetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText emailText, passwordText;
    Button button;
    String emailString;
    String passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 

        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToActvivityB();
//                emailString = emailText.getText().toString();
//                passString = passwordText.getText().toString();
//                Intent i = new Intent(getApplicationContext(), ActivityB.class);
//                i.putExtra("email", ""+emailString);
//                i.putExtra("password", ""+passString);
//                startActivity(i);
            }
        });

    }

    private void GoToActvivityB() {
        emailString = emailText.getText().toString();
        passString = passwordText.getText().toString();
        Intent i = new Intent(this, ActivityB.class);
        i.putExtra("email", ""+emailString);
        i.putExtra("password", ""+passString);
        startActivity(i);

    }
}