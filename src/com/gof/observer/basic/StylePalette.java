package com.gof.observer.basic;

import com.gof.observer.domain.Observer;
import com.gof.observer.domain.Subject;

import java.util.ArrayList;

public class StylePalette implements Subject {
    private ArrayList<Observer> observers;
    private Language language;
    private Gender gender;

    public StylePalette(Language language, Gender gender) {
        observers = new ArrayList<>();
        this.language = language;
        this.gender = gender;
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

    /**
     * Click chart type
     */
    public void setLanguage(Language language) {
        this.language = language;
        notifyObservers();
    }

    /**
     * Click chart type
     */
    public void setGender(Gender gender) {
        this.gender = gender;
        notifyObservers();
    }

    public Language getLanguage() {
        return language;
    }

    public Gender getGender() {
        return gender;
    }
}
