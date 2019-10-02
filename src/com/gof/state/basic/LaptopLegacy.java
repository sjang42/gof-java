package com.gof.state.basic;

public class LaptopLegacy {
    private enum State {ON, OFF, LISTEN}

    private State currentState;

    public LaptopLegacy() {
        currentState = State.OFF;
    }

    public void clickPowerButton() {
        switch (currentState) {
            case ON:
                System.out.println("노트북 종료");
                currentState = State.OFF;
                break;
            case OFF:
                System.out.println("노트북 켜기");
                currentState = State.ON;
                break;
            case LISTEN:
                System.out.println("노트북 대기상태 해제");
                currentState = State.ON;
                break;
        }
    }
}
