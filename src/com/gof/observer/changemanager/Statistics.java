package com.gof.observer.changemanager;

import com.gof.observer.domain.Observer;
import com.gof.observer.domain.Subject;

public class Statistics implements Observer {
    EstimateTransactionWithCM estimateTransactionWithCM;
    private int totalPrice;
    private int numTransaction;

    public Statistics(EstimateTransactionWithCM estimateTransactionWithCM) {
        this.totalPrice = 0;
        this.numTransaction = 0;

        this.estimateTransactionWithCM = estimateTransactionWithCM;
        this.estimateTransactionWithCM.attach(this);
    }

    @Override
    public void update(Subject subject) {
        totalPrice += estimateTransactionWithCM.getPrice();
        numTransaction += 1;
        display();
    }

    public void display() {
        System.out.println(String.format("[Statistics Display]\nNum Transaction\t: %d\nTotal Price\t\t: %d\nAverage Price\t: %f",
                numTransaction, totalPrice, totalPrice / (float) numTransaction));
    }
}
