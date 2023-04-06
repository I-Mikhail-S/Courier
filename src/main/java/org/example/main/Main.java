package org.example.main;

import org.example.enums.EnumCourier;
import org.example.fabric.Builder;
import org.example.person.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        Person car = new Builder(EnumCourier.CAR).id(6).name("sem").speed(6).energy(8).build();
        System.out.println(car.getName());
    }
}