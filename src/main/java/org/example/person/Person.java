package org.example.person;
/**
 * Фундаментальный клас person....
 */
public class Person {

    protected int id;//
    protected String name;
    protected double speed;
    protected double energy;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    protected boolean free;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getEnergy() {
        return energy;
    }

    public boolean isFree() {
        return free;
    }

    public Person() {
    }

    protected Person(PersonBuilder personBuilder) {
        this.id = personBuilder.id;
        this.name = personBuilder.name;
        this.speed = personBuilder.speed;
        this.free = personBuilder.free;
        this.energy = personBuilder.energy;
    }

    public static class PersonBuilder{
        private final int id;
        private final String name;
        protected double speed;
        protected double energy;
        protected boolean free;



        public PersonBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public PersonBuilder speed(int speed){
            this.speed = speed;
            return this;
        }
        public PersonBuilder energy(double energy){
            this.energy = energy;
            return this;
        }
        public PersonBuilder free(boolean free){
            this.free = free;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", energy=" + energy +
                ", free=" + free +
                '}';
    }

    public PersonBuilder builder(){
        return new PersonBuilder(id,name);
    }
}
