package com.lucasambrosi._15_tema_decorator.decorator;

import com.lucasambrosi._15_tema_decorator.pizza.BasePizza;

public abstract class PizzaDecorator implements BasePizza {

    protected BasePizza pizza;

    public PizzaDecorator(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void delivery() {
        pizza.delivery();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
