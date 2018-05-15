package com.lucasambrosi.factory;

import com.lucasambrosi.pojo.Car;
import com.lucasambrosi.pojo.NullCar;
import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    List<Car> listCar = new ArrayList<>();

    public CarFactory(){
        listCar.add(new Car(1, "Blue", 1.0, 14));
        listCar.add(new Car(2, "Green", 1.4, 15));
    }

    public Car findCarById(int id){
        for(Car car : listCar){
            if(car.getId() == id) return car;
        }
        return new NullCar();
    }
}
