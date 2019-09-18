package com.gof.observer.basic;

import com.gof.observer.domain.Observer;
import com.gof.observer.domain.Subject;

public class Statistics implements Observer {
    EstimateTransaction estimateTransaction;
    private int totalPrice;
    private int numTransaction;

    public Statistics(EstimateTransaction estimateTransaction) {
        this.totalPrice = 0;
        this.numTransaction = 0;

        this.estimateTransaction = estimateTransaction;
        this.estimateTransaction.attach(this);
    }

    @Override
    public void update(Subject subject) {
        totalPrice += estimateTransaction.getPrice();
        numTransaction += 1;
        display();
    }

    public void display() {
        System.out.println(String.format("[Statistics Display]\nNum Transaction\t: %d\nTotal Price\t\t: %d\nAverage Price\t: %f",
                numTransaction, totalPrice, totalPrice / (float) numTransaction));
    }
}
