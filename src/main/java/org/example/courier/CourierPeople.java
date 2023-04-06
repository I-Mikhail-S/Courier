package org.example.courier;

import org.example.person.Person;

public class CourierPeople extends Person {
    private int id;
    private String name;
    private double speed;
    private double energy;
    private boolean free;

    public CourierPeople() {
        super();
    }

    public CourierPeople(int id, String name) {
        super(id, name);
    }
}
