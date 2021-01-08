package com.example.section5_demo2_timestable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView timesTableListView;


    public void generateTimesTable(int timesTable){
        ArrayList<String> timesTableContent = new ArrayList<String>();

        for (int i = 0; i <= 10; i++){
            timesTableContent.add(Integer.toString(i * timesTable));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timesTableContent);
        timesTableListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timesTableListView = findViewById(R.id.timesTableListView);
        SeekBar timesTableSeekBar =  findViewById(R.id.timeTableSeekBar);
        timesTableSeekBar.setMax(20);
        timesTableSeekBar.setProgress(10);
        timesTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
             @Override
             public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min = 1;
                int timesTable;

                if (progress < min){
                    timesTable = min;
                    timesTableSeekBar.setProgress(min);
                }else{
                    timesTable = progress;
                }

                generateTimesTable(timesTable);

             }

             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {

             }

             @Override
             public void onStopTrackingTouch(SeekBar seekBar) {

             }
         });

        generateTimesTable(10);

    }
}