package com.lucasambrosi._12_tema_template_method.drinks;

import com.lucasambrosi._12_tema_template_method.template.HotDrink;

public class HotChocolate extends HotDrink {
    @Override
    protected void heatLiquid() {
        System.out.println("\nAquece o leite.");
    }

    @Override
    protected void addIngredient() {
        System.out.println("Adiciona o chocolate.");
    }

    @Override
    protected void putOnCup() {
        System.out.println("Coloca o chocolate quente na taça.");
    }
}
