package com.gof.observer.basic;

import com.gof.observer.domain.Observer;
import com.gof.observer.domain.Subject;

import java.util.ArrayList;

public class EstimateTransaction implements Subject {
    private ArrayList<Observer> observers;
    private String latitude;
    private String longitude;
    private int price;

    public EstimateTransaction() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public void setNewTransaction(String latitude, String longitude, int price) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
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
