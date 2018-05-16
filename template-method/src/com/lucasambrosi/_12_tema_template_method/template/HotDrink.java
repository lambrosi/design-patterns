package com.lucasambrosi._12_tema_template_method.template;

public abstract class HotDrink {

    public final void makeDrink(){
        heatLiquid();
        addIngredient();
        putOnCup();
    }

    protected abstract void heatLiquid();
    protected abstract void addIngredient();
    protected abstract void putOnCup();
}
