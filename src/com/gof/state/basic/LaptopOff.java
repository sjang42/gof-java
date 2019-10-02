package com.gof.state.basic;

public class LaptopOff implements LaptopState {

    @Override
    public void clickPowerButton(Laptop laptop) {
        System.out.println("노트북 켜기");
        laptop.changeState(LaptopStateFactory.getInstance("on"));
    }
}
