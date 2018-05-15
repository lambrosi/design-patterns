package com.lucasambrosi;

import com.lucasambrosi.factory.TelevisionFactory;
import com.lucasambrosi.util.Television;

public class Main {

    public static void main(String[] args){

        TelevisionFactory factory = new TelevisionFactory();

        Television plasma = factory.getTelevision("Plasma");
        plasma.changeChannel(5);

        Television led = factory.getTelevision("LED");
        led.turnOn();
    }
}
