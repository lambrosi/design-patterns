package com.lucasambrosi._9_tema_singleton.util;

public class LED implements Television {

    private boolean state;

    @Override
    public void turnOn() {
        state = true;
        System.out.println("LED TV turned on.");
    }

    @Override
    public void turnOff() {
        state = false;
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Channel changed in LED TV to: " + channel);
    }

    @Override
    public boolean isOn() {
        return state;
    }
}
