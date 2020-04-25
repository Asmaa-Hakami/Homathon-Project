package com.example.myapplication;

import android.widget.ImageView;

public class Item {
    public static int id = 0;
    private String name;
    private double price;
    private int image;
    private int availability;
    private String category;

    public Item() {
    }

    public Item(String name, double price, int image, int availability, String category) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.availability = availability;
        this.category = category;
        id++;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Item.id = id;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
