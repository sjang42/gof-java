package com.gof.observer.java;
import com.gof.observer.domain.Gender;
import com.gof.observer.domain.Language;

import java.util.Observable;

public class StylePalette extends Observable {
    private Language language;
    private Gender gender;

    public StylePalette(Language language, Gender gender) {
        this.language = language;
        this.gender = gender;
    }

    /**
     * Click chart type
     */
    public void setLanguage(Language language) {
        this.language = language;
        setChanged();
        notifyObservers();
    }

    /**
     * Click chart type
     */
    public void setGender(Gender gender) {
        this.gender = gender;
        setChanged();
        notifyObservers();
    }

    public Language getLanguage() {
        return language;
    }

    public Gender getGender() {
        return gender;
    }
}
