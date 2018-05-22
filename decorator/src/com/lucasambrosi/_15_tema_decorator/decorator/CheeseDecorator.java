package com.lucasambrosi._15_tema_decorator.decorator;

import com.lucasambrosi._15_tema_decorator.pizza.BasePizza;

public class CheeseDecorator extends PizzaDecorator {

    private static final double CHEESE_PRICE = 3;

    public CheeseDecorator(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public void delivery(){
        addCheese();
        pizza.delivery();
    }

    private void addCheese(){
        System.out.println("Adicionando queijo.");
    }

    @Override
    public double getPrice() {
        return super.getPrice() + CHEESE_PRICE;
    }
}
