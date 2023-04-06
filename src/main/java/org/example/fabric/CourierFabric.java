package org.example.fabric;

import org.example.courier.CourierBike;
import org.example.courier.CourierCar;
import org.example.courier.CourierPeople;
import org.example.delete.EnumCourier;
import org.example.person.Person;

public class CourierFabric {
    public Person orderCoffee(EnumCourier type) {
        Person person = null;

        switch (type) {
            case PEOPLE:
                person = new CourierPeople();
                break;
            case BIKE:
                person = new CourierBike();
                break;
            case CAR:
                person = new CourierCar();
                break;
        }
        return person;
    }
}
