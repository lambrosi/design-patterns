package com.lucasambrosi._10_tema_builder.pojo;

public class PersonAddress {

    private int number;
    private String street;
    private String city;
    private String state;

    public PersonAddress(String street, int number, String city, String state) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("%s, %s - %s, %s", street, number, city, state);
    }
}
