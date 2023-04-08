package org.example.main;

import org.example.couriers.BikeCourier;
import org.example.enumType.EnumCourier;
import org.example.person.Person;
import org.example.service.FactoryCourier;
import org.example.time.Time;

public class Main {
    public static void main(String[] args) {
        FactoryCourier factoryCourier = new FactoryCourier();
        Person bikeCourier = factoryCourier.addTypeCourier(41241,"Stepan",EnumCourier.BIKE);
        System.out.println();
    }
}