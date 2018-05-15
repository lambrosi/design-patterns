package com.lucasambrosi._9_tema_singleton;

import com.lucasambrosi._9_tema_singleton.factory.TelevisionFactory;
import com.lucasambrosi._9_tema_singleton.util.Television;

public class Main {

    public static void main(String[] args){

        TelevisionFactory factory = TelevisionFactory.getInstance();

        Television television1 = factory.getTelevision("LED");
        television1.changeChannel(5);

        Television television2 = factory.getTelevision("Plasma");
        television2.turnOn();
    }
}
