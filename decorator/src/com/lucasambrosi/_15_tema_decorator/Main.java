package com.lucasambrosi._15_tema_decorator;

import com.lucasambrosi._15_tema_decorator.decorator.BaconDecorator;
import com.lucasambrosi._15_tema_decorator.decorator.CheeseDecorator;
import com.lucasambrosi._15_tema_decorator.pizza.BasePizza;
import com.lucasambrosi._15_tema_decorator.pizza.Pizza;

public class Main {

    public static void main(String[] args){

        BasePizza pizza = new BaconDecorator(
                                new CheeseDecorator(
                                    new CheeseDecorator(
                                        new Pizza())));

        pizza.delivery();
        System.out.println("Preco: R$ " + pizza.getPrice());
    }
}
