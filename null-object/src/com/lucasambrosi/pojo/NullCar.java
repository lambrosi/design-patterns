package com.lucasambrosi.pojo;

public class NullCar extends Car {

    public int getId(){
        return -1;
    }

    public String getColor() {
        return "";
    }

    public double getEngineMotor() {
        return 0.0;
    }

    public double getWheelRim() {
        return 0.0;
    }
}
