package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1 - ListView
    private ListView listView;

    // 2 - Data
    String[] title = {
            "Being a father",
            "Making an app",
            "Maybe becoming a YouTuber",
            "Making a successful Business"
    };

    String[] description = {
            "I thought that this would never happen to me!",
            "After years of failure, I am going to make something! Woot!",
            "I might try something else that I am deathly scared to do!",
            "John, Nicole, and to everyone else - Thank you for the support!"
    };

    // 2B - Images as an array
    Integer[] images = {
            R.drawable.baby,
            R.drawable.android,
            R.drawable.youtube,
            R.drawable.work
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter = new MyListAdapter(this, title,description,images);

        listView = findViewById(R.id.myList);
        listView.setAdapter(adapter);

        //Handling click events on items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Item 1 selected
                if(position == 0){
                    Toast.makeText(MainActivity.this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                }
                else if(position == 1){
                    Toast.makeText(MainActivity.this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                }
                else if(position == 2){
                    Toast.makeText(MainActivity.this, "Item 3 selected", Toast.LENGTH_SHORT).show();
                }
                else if(position == 3){
                    Toast.makeText(MainActivity.this, "Item 4 selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}