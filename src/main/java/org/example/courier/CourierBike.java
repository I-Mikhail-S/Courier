package org.example.courier;

import org.example.person.Person;

public class CourierBike  extends Person{
    private int id;
    private String name;
    private double speed;
    private double energy;
    private boolean free;

    public CourierBike() {
        super();
    }

    public CourierBike(int id, String name, double speed, double energy) {
        super(id, name);
    }

}
