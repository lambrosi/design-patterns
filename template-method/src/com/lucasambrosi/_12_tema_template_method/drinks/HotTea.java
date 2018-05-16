package com.lucasambrosi._12_tema_template_method.drinks;

import com.lucasambrosi._12_tema_template_method.template.HotDrink;

public class HotTea extends HotDrink {
    @Override
    protected void heatLiquid() {
        System.out.println("Aquece a água.");
    }

    @Override
    protected void addIngredient() {
        System.out.println("Adiciona o chá.");
    }

    @Override
    protected void putOnCup() {
        System.out.println("Coloca o chá na xícara.");
    }
}
