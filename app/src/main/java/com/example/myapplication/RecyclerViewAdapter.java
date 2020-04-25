package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.MyViewHolder> {

    private List<Item> itemList;
    private Context mContext;

    public RecyclerViewAdapter(Context mContext,List<Item> items) {
        itemList = items;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.imageView.setImageResource(itemList.get(position).getImage());
        holder.textView.setText(itemList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void filterList(ArrayList<Item> filteredList){
        itemList = filteredList;
        notifyDataSetChanged();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView = (ImageView)itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.text_view);
        }
    }
}
