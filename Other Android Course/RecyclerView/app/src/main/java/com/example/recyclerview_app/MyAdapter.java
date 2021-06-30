package com.example.recyclerview_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<RpgCharacter> toonList;

    public MyAdapter(List<RpgCharacter> toonList){
        this.toonList = toonList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rpgcharacter_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.MyViewHolder holder, int position) {
        RpgCharacter toon = toonList.get(position);
        holder.name.setText(toon.getName());
        holder.race.setText(toon.getRace());
        holder.battleClass.setText(toon.getBattleClass());

    }

    @Override
    public int getItemCount() {
        return toonList.size();
    }

    // Create a new class called: MyViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder{

        //Create Widgets
        public TextView name, race, battleClass;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name_text);
            race = itemView.findViewById(R.id.race_text);
            battleClass = itemView.findViewById(R.id.battleClass_text);
        }
    }

}
