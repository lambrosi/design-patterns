package com.lucasambrosi._10_tema_builder;

import com.lucasambrosi._10_tema_builder.builder.Person;

public class Main {

    public static void main(String[] args){

        Person person = new Person.PersonBuilder()
                .name("Nome de Teste")
                .birthDate("05/07/1999")
                .personAddress("Rua de Teste", 230, "Porto Alegre", "RS")
                .create();

        System.out.println(person.toString());
    }
}
