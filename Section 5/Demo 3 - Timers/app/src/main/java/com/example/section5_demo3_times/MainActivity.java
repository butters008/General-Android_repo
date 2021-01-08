package com.example.section5_demo3_times;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {
            public void onTick(long millisecondsUntilDone){
                //counting down each second
                Log.i("Seconds left: ", String.valueOf(millisecondsUntilDone / 1000));
            }

            public void onFinish(){
                //counter is finished
                Log.i("Done! ", "Countdown Timer Finished");
            }
        }.start();
    }


//        Handler handler = new Handler();
//        Runnable run = new Runnable() {
//            public void run(){
//                Log.i("Runnable has run", "a second has passed...");
//                handler.postDelayed(this, 1000);
//            }
//        };
//
//        handler.post(run);
//    }
}