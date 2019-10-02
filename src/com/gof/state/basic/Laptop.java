package com.gof.state.basic;

public class Laptop {
    private LaptopState state;

    public Laptop(LaptopState state) {
        this.state = state;
    }

    void clickPowerButton() {
        state.clickPowerButton(this);
    }

    void changeState(LaptopState to) {
        state = to;
    }
}
