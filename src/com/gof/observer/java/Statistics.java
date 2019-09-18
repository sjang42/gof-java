package com.gof.observer.java;

import java.util.Observable;
import java.util.Observer;

public class Statistics implements Observer {
    private EstimateTransaction estimateTransaction;
    private int totalPrice;
    private int numTransaction;

    public Statistics(EstimateTransaction estimateTransaction) {
        this.totalPrice = 0;
        this.numTransaction = 0;

        this.estimateTransaction = estimateTransaction;
        this.estimateTransaction.addObserver(this);
    }

    public void display() {
        System.out.println(String.format("[Statistics Display]\nNum Transaction\t: %d\nTotal Price\t\t: %d\nAverage Price\t: %f",
                numTransaction, totalPrice, totalPrice / (float) numTransaction));
    }

    @Override
    public void update(Observable o, Object arg) {
        totalPrice += estimateTransaction.getPrice();
        numTransaction += 1;
        display();
    }
}
