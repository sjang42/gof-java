package com.gof.observer.java;

import com.gof.observer.domain.Gender;
import com.gof.observer.domain.Language;

import java.util.Observable;
import java.util.Observer;

public class Reporter implements Observer {
    private StylePalette stylePalette;
    private EstimateTransaction estimateTransaction;
    private Gender gender;
    private Language language;

    public Reporter(StylePalette stylePalette, EstimateTransaction estimateTransaction) {
        this.language = Language.KOR;
        this.gender = Gender.MAN;

        this.stylePalette = stylePalette;
        this.stylePalette.addObserver(this);

        this.estimateTransaction = estimateTransaction;
        this.estimateTransaction.addObserver(this);
    }

    private String getNewsTitle(String latitude, String longitude, int price) {
        if (language == Language.ENG) {
            return String.format("House in (%s, %s) sold at price %d won!!!", latitude, longitude, price);
        } else {
            return String.format("(%s, %s) 부지가 %d원에 팔렸습니다!!! ", latitude, longitude, price);
        }
    }

    @SuppressWarnings("Duplicates")
    private String getReporterName() {
        if (language == Language.ENG && gender == Gender.MAN) {
            return "Mike";
        } else if (language == Language.ENG && gender == Gender.WOMAN) {
            return "Eve";
        } else if (language == Language.KOR && gender == Gender.MAN) {
            return "철수";
        } else {
            return "영희";
        }
    }

    @Override
    @SuppressWarnings("Duplicates")
    public void update(Observable o, Object arg) {
        if (o == stylePalette) {
            gender = stylePalette.getGender();
            language = stylePalette.getLanguage();
        } else if (o == estimateTransaction) {
            System.out.println(getNewsTitle(estimateTransaction.getLatitude(), estimateTransaction.getLongitude(), estimateTransaction.getPrice()) +
                    " by " + getReporterName());
        } else {
            System.out.println("Unknown source");
        }
    }
}
