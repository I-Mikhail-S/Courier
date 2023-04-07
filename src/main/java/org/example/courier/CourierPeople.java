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
