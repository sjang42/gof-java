package com.gof.observer.domain;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}
