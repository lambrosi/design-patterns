package com.lucasambrosi;

import com.lucasambrosi.factory.CarFactory;
import com.lucasambrosi.pojo.Car;

public class Main {

    public static void main(String[] args){

        CarFactory factory = new CarFactory();

        Car car = factory.findCarById(1);
        System.out.println(car.getColor());

        Car nullCar = factory.findCarById(100); //id 100 doesn't exist
        System.out.println(nullCar.getColor());
    }
}
