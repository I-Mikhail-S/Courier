package org.example.person;
/**
 * Фундаментальный клас person....
 */
public  class Person {

    private int id;//
    private String name;
    private double speed;
    private double energy;

    public Person() {

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, double speed, double energy) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.energy = energy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }


}


