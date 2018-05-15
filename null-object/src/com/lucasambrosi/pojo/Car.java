package com.lucasambrosi.pojo;

public class Car {

    private int id;
    private String color;
    private double engineMotor;
    private double wheelRim;

    public Car(){}

    public Car(int id, String color, double engineMotor, double wheelRim) {
        this.id = id;
        this.color = color;
        this.engineMotor = engineMotor;
        this.wheelRim = wheelRim;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public double getEngineMotor() {
        return engineMotor;
    }

    public double getWheelRim() {
        return wheelRim;
    }
}
