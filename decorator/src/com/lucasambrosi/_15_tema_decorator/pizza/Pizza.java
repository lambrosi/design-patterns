package com.lucasambrosi._15_tema_decorator.pizza;

public class Pizza implements BasePizza {

    private double price = 20;

    @Override
    public void delivery() {
        System.out.println("Pizza pronta!");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
