package com.gof.observer.changemanager;

import com.gof.observer.domain.Gender;
import com.gof.observer.domain.Language;

public class MainWithCM {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        SimpleChangeManager simpleChangeManager = new SimpleChangeManager();
        EstimateTransactionWithCM estimateTransaction = new EstimateTransactionWithCM(simpleChangeManager);
        StylePaletteWithCM stylePalette = new StylePaletteWithCM(simpleChangeManager);
        Reporter reporter = new Reporter(stylePalette, estimateTransaction);
        Statistics statistics = new Statistics(estimateTransaction);

        estimateTransaction.setNewTransaction("125", "30", 3000);
        stylePalette.setGender(Gender.WOMAN);
        System.out.println("--------------------------------------------------------------------------------");
        estimateTransaction.setNewTransaction("125", "31", 4000);
        stylePalette.setLanguage(Language.ENG);
        System.out.println("--------------------------------------------------------------------------------");
        estimateTransaction.setNewTransaction("125", "32", 20000);
    }
}
