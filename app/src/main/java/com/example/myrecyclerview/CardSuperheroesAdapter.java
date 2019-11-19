package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardSuperheroesAdapter extends RecyclerView.Adapter<CardSuperheroesAdapter.CardViewViewHolder>{

    private Context mContext;
    private ArrayList<SuperHeroes> list_superheroes = new ArrayList<>();

    public CardSuperheroesAdapter(Context mContext, ArrayList<SuperHeroes> list) {
        this.mContext = mContext;
        this.list_superheroes = list;
    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_superheroes, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        SuperHeroes hero = list_superheroes.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPicture())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.Name.setText(hero.getName());
        holder.Detail.setText(hero.getDetail());
        holder.Favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        list_superheroes.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " +
                        list_superheroes.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + list_superheroes.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_superheroes.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView Name, Detail;
        Button Favorite, Share;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            Name = itemView.findViewById(R.id.tv_item_name);
            Detail = itemView.findViewById(R.id.tv_item_detail);
            Favorite = itemView.findViewById(R.id.btn_set_favorite);
            Share = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
