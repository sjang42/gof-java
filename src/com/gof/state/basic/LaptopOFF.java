package com.gof.state.basic;

public class LaptopOFF implements LaptopState {

    @Override
    public void clickPowerButton(Laptop laptop) {
        System.out.println("노트북 켜기");
        laptop.changeState(new LaptopOn());
    }
}
