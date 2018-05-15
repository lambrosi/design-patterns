package com.lucasambrosi.factory;

import com.lucasambrosi.util.LED;
import com.lucasambrosi.util.Plasma;
import com.lucasambrosi.util.Television;

public class TelevisionFactory {

    public Television getTelevision(String type){
        switch(type){
            case "Plasma": return new Plasma();
            case "LED": return new LED();
            default: throw new RuntimeException("Invalid type");
        }
    }
}
