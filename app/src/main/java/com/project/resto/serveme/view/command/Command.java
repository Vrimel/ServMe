package com.project.resto.serveme.view.command;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.project.resto.serveme.R;
import com.project.resto.serveme.adapter.AdapterDish;

import java.util.ArrayList;
import java.util.List;

public class Command extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);

        List<String> lst_Dish = new ArrayList<>();
        fill_Dish(lst_Dish);

        RecyclerView rv_Plat = findViewById(R.id.rv_Plat);

        rv_Plat.setLayoutManager(new GridLayoutManager(this, 2));

        rv_Plat.setAdapter(new AdapterDish(lst_Dish));

    }

    //Create list of dish
    private void fill_Dish(List<String> lst_Dish) {
        lst_Dish.add( getString(R.string.dish1));
        lst_Dish.add( getString(R.string.dish2));
        lst_Dish.add( getString(R.string.dish3));
        lst_Dish.add( getString(R.string.dish4));
        lst_Dish.add( getString(R.string.dish5));
        lst_Dish.add( getString(R.string.dish6));
        lst_Dish.add( getString(R.string.dish7));
    }
}
