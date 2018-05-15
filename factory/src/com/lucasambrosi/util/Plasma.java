package com.lucasambrosi.util;

public class Plasma implements Television {

    private boolean state;

    @Override
    public void turnOn() {
        state = true;
    }

    @Override
    public void turnOff() {
        state = false;
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Channel changed in Plasma TV to: " + channel);
    }

    @Override
    public boolean isOn() {
        return state;
    }
}
