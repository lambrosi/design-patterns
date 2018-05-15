package com.lucasambrosi._9_tema_singleton.factory;

import com.lucasambrosi._9_tema_singleton.util.*;

public class TelevisionFactory {

    private static TelevisionFactory instance;

    private TelevisionFactory(){}

    public static TelevisionFactory getInstance(){
        if(instance == null)
            instance = new TelevisionFactory();
        return instance;
    }

    public Television getTelevision(String type){
        switch (type){
            case "Plasma": return new Plasma();
            case "LED": return new LED();
            default: throw new RuntimeException("Invalid type");
        }
    }
}
