package com.lucasambrosi._12_tema_template_method;

import com.lucasambrosi._12_tema_template_method.drinks.*;
import com.lucasambrosi._12_tema_template_method.template.HotDrink;

public class Main {

    public static void main(String[] args){

        HotDrink tea = new HotTea();
        tea.makeDrink();

        HotDrink chocolate = new HotChocolate();
        chocolate.makeDrink();
    }

}
