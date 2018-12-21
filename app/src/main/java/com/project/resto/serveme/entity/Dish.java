package com.project.resto.serveme.entity;

import java.util.List;

public class Dish {


    private String name;
    private String picture;
    private List<String> ingredient;
    private double price;

    public Dish(String name, String picture) {
        this.setName(name);
        this.setPicture(picture);
        this.setPrice(0);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
