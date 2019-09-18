package com.gof.observer.java;

import java.util.Observable;

public class EstimateTransaction extends Observable {
    private String latitude;
    private String longitude;
    private int price;

    public void setNewTransaction(String latitude, String longitude, int price) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
        setChanged();
        notifyObservers();
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public int getPrice() {
        return price;
    }
}
