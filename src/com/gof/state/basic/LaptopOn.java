package com.gof.state.basic;

public class LaptopOn implements LaptopState {

    @Override
    public void clickPowerButton(Laptop laptop) {
        System.out.println("노트북 종료");
        laptop.changeState(LaptopStateFactory.getInstance("off"));
    }
}
