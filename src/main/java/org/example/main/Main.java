package org.example.main;

import org.example.courier.CourierBike;
import org.example.delete.EnumCourier;
import org.example.fabric.CourierFabric;
import org.example.person.Person;
import org.example.service.CourierService;

public class Main {
    public static void main(String[] args) {
        CourierFabric courierFabric = new CourierFabric();
        Person courierCar = courierFabric.orderCoffee(EnumCourier.CAR);
    }
}