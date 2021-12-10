package com.example.help.useful;

import android.graphics.Bitmap;

public class City {

    private Bitmap Picture;
    private String TripName;
    private String Description;
    private String Price;
    private boolean Favorit;

    public City() {}

    public City(Bitmap picture, String tripName, String description, String price, boolean favorit) {
        Picture = picture;
        TripName = tripName;
        Description = description;
        Price = price;
        Favorit = favorit;
    }

    public Bitmap getPicture() {
        return Picture;
    }

    public void setPicture(Bitmap picture) {
        Picture = picture;
    }

    public String getTripName() {
        return TripName;
    }

    public void setTripName(String tripName) {
        TripName = tripName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public boolean isFavorit() {
        return Favorit;
    }

    public void setFavorit(boolean favorit) {
        Favorit = favorit;
    }
}
