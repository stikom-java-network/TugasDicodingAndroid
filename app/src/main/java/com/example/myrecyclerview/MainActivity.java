package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_Superhero;
    ArrayList<SuperHeroes> list_superhero = new ArrayList<>();
    SuperheroesAdapter br_adapter;
    GridSuperheroesAdapter grid_adapter;
    CardSuperheroesAdapter card_adapter;
    private String title = "Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showRecyclerList();
        setActionBarTitle(title);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void showRecyclerList(){
        rv_Superhero = findViewById(R.id.rv_superhero);
        br_adapter = new SuperheroesAdapter(MainActivity.this, list_superhero);

        prepareData();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        rv_Superhero.setLayoutManager(mLayoutManager);
        rv_Superhero.setAdapter(br_adapter);
        br_adapter.notifyDataSetChanged();

    }

    private void showRecyclerGrid(){
        rv_Superhero = findViewById(R.id.rv_superhero);
        grid_adapter = new GridSuperheroesAdapter(MainActivity.this, list_superhero);

        prepareData();

        rv_Superhero.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        rv_Superhero.setAdapter(grid_adapter);

    }

    private void showRecyclerCard(){
        rv_Superhero = findViewById(R.id.rv_superhero);
        card_adapter = new CardSuperheroesAdapter(MainActivity.this, list_superhero);

        prepareData();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        rv_Superhero.setLayoutManager(mLayoutManager);
        rv_Superhero.setAdapter(card_adapter);
        card_adapter.notifyDataSetChanged();
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Mode Card";
                showRecyclerCard();
                break;
        }
        setActionBarTitle(title);

    }

    private void prepareData() {

        SuperHeroes s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);

        s = new SuperHeroes();
        s.setPicture(R.drawable.tony);
        s.setName("Iron Man");
        s.setDetail("Superhero yang memakai baju besi, memiliki kekuatan super berupa laser dan dapat terbang");
        list_superhero.add(s);


    }


}
