package org.example.courier;

import org.example.person.Person;

public class CourierBike extends Person {
    private int id;
    private String name;
    private double speed;
    private double energy;
    private boolean free;

    public CourierBike() {
    }

    public CourierBike(int id, String name) {
        super(new PersonBuilder(id,name));
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public double getEnergy() {
        return super.getEnergy();
    }

    @Override
    public boolean isFree() {
        return super.isFree();
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "CourierBike{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", energy=" + energy +
                ", free=" + free +
                '}';
    }
}
