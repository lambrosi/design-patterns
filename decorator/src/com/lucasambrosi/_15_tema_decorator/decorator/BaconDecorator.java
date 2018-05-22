package com.lucasambrosi._15_tema_decorator.decorator;

import com.lucasambrosi._15_tema_decorator.pizza.BasePizza;

public class BaconDecorator extends PizzaDecorator {

    private static final double BACON_PRICE = 3.5;

    public BaconDecorator(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public void delivery(){
        addBacon();
        pizza.delivery();
    }

    private void addBacon(){
        System.out.println("Adicionando bacon.");
    }

    @Override
    public double getPrice() {
        return super.getPrice() + BACON_PRICE;
    }
}
