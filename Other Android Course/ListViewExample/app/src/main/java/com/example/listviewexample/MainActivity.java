package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Data to be displayed
    String[] mobileTypes = {
        "Phone 1",
        "tablet 3",
        "Things 43",
        "item 2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        //Creating an array adapter
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mobileTypes);

        listView.setAdapter(adapter);

        //Handling clicked events in listView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "I will do this: " + position, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "I will do this: " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}