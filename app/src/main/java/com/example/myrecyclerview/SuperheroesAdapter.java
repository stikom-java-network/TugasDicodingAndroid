package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SuperheroesAdapter extends RecyclerView.Adapter<SuperheroesAdapter.MyListViewHolder> {

    private Context mContext;
    private ArrayList<SuperHeroes> list_superheroes = new ArrayList<>();


    public SuperheroesAdapter(Context mContext, ArrayList<SuperHeroes> list_superheroes) {
        this.mContext = mContext;
        this.list_superheroes = list_superheroes;

    }

    @NonNull
    @Override
    public MyListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_superheroes, parent, false);
        return new MyListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyListViewHolder holder ,int position) {
        SuperHeroes m = list_superheroes.get(position);

        holder.Picture.setImageResource(Integer.valueOf(m.getPicture()));
        holder.Name.setText(String.valueOf(m.getName()));
        holder.Detail.setText(String.valueOf(m.getDetail()));

    }

    @Override
    public int getItemCount() {
        return list_superheroes.size();
    }

    public class MyListViewHolder extends RecyclerView.ViewHolder {

        ImageView Picture;
        TextView Name, Detail;

        public MyListViewHolder(@NonNull View itemView) {
            super(itemView);
            Picture = itemView.findViewById(R.id.img_item_photo);
            Name = itemView.findViewById(R.id.tv_item_name);
            Detail = itemView.findViewById(R.id.tv_item_detail);

        }
    }


}
