package com.example.recyclerview_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Creating objects, lists, and vars
    private RecyclerView recyclerView;
    private List<RpgCharacter> toonList = new ArrayList<>();
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting var to recyclerView that is in activity
        //Initializing vars
        recyclerView = findViewById(R.id.RecyclerView);
        myAdapter = new MyAdapter(toonList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);

        insertData();

    }

    private void insertData() {
        RpgCharacter toon1 = new RpgCharacter("Bo", "Human", "Monk");
        RpgCharacter toon2 = new RpgCharacter("Caleb", "Human", "Wizard");
        RpgCharacter toon3 = new RpgCharacter("Jester", "Teafling", "Cleric");
        RpgCharacter toon4 = new RpgCharacter("Noct", "Goblin", "Rogue");

        toonList.add(toon1);
        toonList.add(toon2);
        toonList.add(toon3);
        toonList.add(toon4);

        myAdapter.notifyDataSetChanged();

    }
}