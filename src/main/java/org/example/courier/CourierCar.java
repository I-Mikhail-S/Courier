package org.example.courier;

import org.example.person.Person;

public class CourierCar extends Person {
    private int id;
    private String name;
    private double speed;
    private double energy;
    private boolean free;

    public CourierCar() {
        super();
    }

    public CourierCar(int id, String name) {
        super(id, name);
    }
}
