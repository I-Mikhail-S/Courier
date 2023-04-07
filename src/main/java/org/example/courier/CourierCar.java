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
