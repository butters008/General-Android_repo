package com.example.section5_demo1_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Keith");
        myFamily.add("Nicole");
        myFamily.add("Nugget");
        myFamily.add("Lucy");
        myFamily.add("Kylo");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                parent.setVisibility(View.GONE);
                Log.i("Person Tapped: ", myFamily.get(position));
                Toast.makeText(getApplicationContext(), "Hello " + myFamily.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}