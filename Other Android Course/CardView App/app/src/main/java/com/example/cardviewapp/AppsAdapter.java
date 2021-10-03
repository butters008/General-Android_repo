package com.example.cardviewapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AppsAdapter extends RecyclerView.Adapter<AppsAdapter.MyViewHolder> {

    private Context context;
    private List<AppsModel> list;

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull AppsAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //Step 1: MyView holder Class
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, appsDown;
        public ImageView thumbnail;

        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            //Initializing the views:
            title = itemView.findViewById(R.id.title);
            appsDown = itemView.findViewById(R.id.count);
            thumbnail= itemView.findViewById(R.id.thumbnail);
        }
    }

    //Step 2: Variables and Constructors
    public AppsAdapter(Context context, List<AppsModel> list){
        this.context = context;
        this.list = list;
    }
}
