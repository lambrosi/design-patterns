package com.lucasambrosi._10_tema_builder.builder;

import com.lucasambrosi._10_tema_builder.pojo.PersonAddress;

public class Person {

    private String name;
    private String birthDate;
    private PersonAddress personAddress;

    private Person(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPersonAddress(PersonAddress personAddress) {
        this.personAddress = personAddress;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nBirth Date: %s\nAddress: %s", name, birthDate, personAddress.toString());
    }

    public static class PersonBuilder {

        Person person;

        public PersonBuilder() {
            person = new Person();
        }

        public PersonBuilder name(String name) {
            person.setName(name);
            return this;
        }

        public PersonBuilder birthDate(String birthDate) {
            person.setBirthDate(birthDate);
            return this;
        }

        public PersonBuilder personAddress(String street, int number, String city, String state) {
            person.setPersonAddress(new PersonAddress(street, number, city, state));
            return this;
        }

        public Person create() {
            return person;
        }
    }
}
