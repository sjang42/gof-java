package com.gof.observer.changemanager;

import com.gof.observer.domain.Observer;
import com.gof.observer.domain.Subject;

import java.util.ArrayList;

public class EstimateTransactionWithCM implements Subject {
    private ChangeManager changeManager;
    private String latitude;
    private String longitude;
    private int price;

    public EstimateTransactionWithCM(ChangeManager changeManager) {
        this.changeManager = changeManager;
    }

    @Override
    public void attach(Observer o) {
        changeManager.register(this, o);
    }

    @Override
    public void detach(Observer o) {
        changeManager.unregister(this, o);
    }

    @Override
    public void notifyObservers() {
        changeManager.notifyObservers(this);
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
