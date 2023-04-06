package org.example.service;

import org.example.delete.EnumCourier;
import org.example.fabric.CourierFabric;
import org.example.person.Person;

public class CourierService {
    private final CourierFabric courierFabric;

    public CourierService(CourierFabric courierFabric) {
        this.courierFabric = courierFabric;
    }
    public Person orderCoffee(EnumCourier type) {
        Person coffee = courierFabric.orderCoffee(type);
        return coffee;
    }
}
