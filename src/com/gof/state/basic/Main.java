package com.gof.state.basic;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(LaptopStateFactory.getInstance("listen"));
        laptop.clickPowerButton();
        laptop.clickPowerButton();
        laptop.clickPowerButton();
        laptop.clickPowerButton();
        laptop.clickPowerButton();
    }
}
