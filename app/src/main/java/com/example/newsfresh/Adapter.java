package com.example.newsfresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<AdapterViewHolder>{
    
    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
class AdapterViewHolder extends RecyclerView.ViewHolder {
    TextView mheading,mcontent,mauthor,mtime;
    CardView cardView;
    ImageView imageView;
    public AdapterViewHolder(@NonNull View itemView) {
        super(itemView);
        mheading=itemView.findViewById(R.id.mainHeading);
        mcontent=itemView.findViewById(R.id.content);
        mauthor=itemView.findViewById(R.id.author);
        mtime=itemView.findViewById(R.id.time);
        imageView=itemView.findViewById(R.id.imageView);
        cardView=itemView.findViewById(R.id.cardView);
    }
}