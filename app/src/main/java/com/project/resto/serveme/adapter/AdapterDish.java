package com.project.resto.serveme.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.resto.serveme.R;
import com.project.resto.serveme.entity.Dish;
import com.project.resto.serveme.viewholder.ViewDish;

import java.util.List;

public class AdapterDish extends RecyclerView.Adapter<ViewDish> {

    private List<Dish> lst_Dish;

    public AdapterDish(List<Dish> lst_Dish) {
        this.lst_Dish = lst_Dish;
    }

    @Override
    public ViewDish onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_dish,viewGroup,false);
        return new ViewDish(view);
    }


    @Override
    public void onBindViewHolder(ViewDish myViewHolder, int position) {
        String plat = lst_Dish.get(position).getName();
        myViewHolder.bind(plat);
    }

    @Override
    public int getItemCount() {
        return lst_Dish.size();
    }
}
