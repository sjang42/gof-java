package com.gof.state.basic;

public class LaptopListen implements LaptopState {
    @Override
    public void clickPowerButton(Laptop laptop) {
        System.out.println("노트북 깨우기");
        laptop.changeState(new LaptopOn());
    }
}
