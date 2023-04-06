package org.example.service;

import org.example.couriers.BikeCourier;
import org.example.couriers.CarCourier;
import org.example.couriers.PeopleCourier;
import org.example.enumType.EnumCourier;
import org.example.person.Person;

public class FactoryCourier {
    public Person addTypeCourier(int id,String name,EnumCourier type) {
        Person person = null;

        switch (type) {
            case PEOPLE:
                person = new PeopleCourier();
                break;
            case CAR:
                person = new CarCourier();
                break;
            case BIKE:
                person = new BikeCourier();
                break;
        }
        return person;
    }
}
