package com.example.newsfresh;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.net.Inet4Address;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<Listitem> listitem;
    static Context context;

    public RecyclerViewAdapter(List<Listitem> listitem, Context context) {
        this.listitem = listitem;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Listitem item = listitem.get(position);
        holder.title.setText(item.getTitle());
        holder.author.setText(item.getSource());
        holder.publishedAt.setText(item.getPublishedAt());
        holder.url = item.getLink();
        Glide.with(context).load(item.getImgUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView author;
    TextView publishedAt;
    String url;
    String imgUrl;
    ImageView imageView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        author = itemView.findViewById(R.id.author);
        publishedAt = itemView.findViewById(R.id.time);
        imageView=itemView.findViewById(R.id.newsImage);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecyclerViewAdapter.context, webView.class);
                intent.putExtra("url",url);
                RecyclerViewAdapter.context.startActivity(intent);
            }
        });
    }
}
