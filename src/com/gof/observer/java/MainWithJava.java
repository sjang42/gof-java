package com.gof.observer.java;

import com.gof.observer.domain.Gender;
import com.gof.observer.domain.Language;

public class MainWithJava {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        EstimateTransaction estimateTransaction = new EstimateTransaction();
        StylePalette stylePalette = new StylePalette(Language.KOR, Gender.MAN);
        Reporter reporter = new Reporter(stylePalette, estimateTransaction);
        Statistics statistics = new Statistics(estimateTransaction);

        estimateTransaction.setNewTransaction("125", "30", 3000);
        stylePalette.setGender(Gender.WOMAN);
        estimateTransaction.setNewTransaction("125", "31", 4000);
        stylePalette.setLanguage(Language.ENG);
        estimateTransaction.setNewTransaction("125", "32", 1293000);
    }
}
