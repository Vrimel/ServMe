package com.project.resto.serveme.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.project.resto.serveme.R;

public class ViewDish extends RecyclerView.ViewHolder {

    private TextView tv_NameDish;

    public ViewDish(@NonNull View itemView) {
        super(itemView);
        tv_NameDish = itemView.findViewById(R.id.tv_adpter_dish);
    }

    public void bind(String dish){
        tv_NameDish.setText(dish);
    }
}
