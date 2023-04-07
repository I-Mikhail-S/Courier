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

    public CourierBike(int id, String name) {
        super(id, name);
    }

    public boolean isFree() {
        return free;
    }

    @Override
    public String toString() {
        return "CourierCar{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", energy=" + getEnergy() +
                ", free=" + isFree() +
                '}';
    }
}
