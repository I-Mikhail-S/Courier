package org.example.person;

public abstract class Person {

    private int id;
    private String name;
    private double speed;
    private double energy; //сила

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", energy=" + energy + '}';
    }
}