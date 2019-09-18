package com.gof.observer.changemanager;

import com.gof.observer.domain.Gender;
import com.gof.observer.domain.Language;
import com.gof.observer.domain.Observer;
import com.gof.observer.domain.Subject;

public class StylePaletteWithCM implements Subject {
    private ChangeManager changeManager;
    private Language language;
    private Gender gender;

    public StylePaletteWithCM(ChangeManager changeManager) {
        this.changeManager = changeManager;
        this.language = Language.KOR;
        this.gender = Gender.MAN;
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
