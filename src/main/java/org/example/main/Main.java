package org.example.main;

import org.example.enumType.EnumCourier;
import org.example.fabricPerson.BuilderPerson;
import org.example.person.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        Person car = new BuilderPerson(EnumCourier.CAR).build();
        System.out.println(car.toString());
        System.out.println(car.toString());
    }
}