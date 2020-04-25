package com.example.myapplication;

public class Supermarket {
    private String name;
   // private String category [];
    private String Items [];
    private String location;

    public Supermarket(){}

    public Supermarket(String name, String location){
        this.name = name;
        this.location = location;
        //this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String[] getItems() {
        return Items;
    }

    public void setItems(String[] items) {
        Items = items;
    }
}
