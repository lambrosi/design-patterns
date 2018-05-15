package com.lucasambrosi._9_tema_singleton.util;

public class Plasma implements Television {

    private boolean state;

    @Override
    public void turnOn() {
        state = true;
        System.out.println("Plasma TV turned on.");
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
