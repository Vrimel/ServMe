package com.project.resto.serveme.entity;

import java.util.List;

public class Dish {


    private String name;
    private String picture;
    private List<String> ingredient;

    public Dish(String name, String picture) {
        this.setName(name);
        this.setPicture(picture);
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
}
