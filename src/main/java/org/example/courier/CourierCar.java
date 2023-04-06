package org.example.courier;

import org.example.person.Person;

public class CourierCar extends Person {
    private int id;
    private String name;
    private double speed;
    private double energy;
    private boolean free;

    public CourierCar() {
    }

    public CourierCar(int id, String name) {
        super(new PersonBuilder(id,name));
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
}
