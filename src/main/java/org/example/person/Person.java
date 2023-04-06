package org.example.person;
/**
 * Фундаментальный клас person....
 */
public  class Person {

    private  int id;
    private String name;
    private double speed;
    private double energy;


    public Person(PersonBuilder personBuilder) {
        this.id = personBuilder.id;
        this.name = personBuilder.name;
        this.speed = personBuilder.speed;
        this.energy = personBuilder.energy;
    }

    public Person() {
    }
    public static class PersonBuilder{
        private final  int id;
        private final String name;
        private double speed;
        private double energy;
        public PersonBuilder(int id,String name){
            this.id = id;
            this.name = name;
        }

        public PersonBuilder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public PersonBuilder energy(double energy) {
            this.energy = energy;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", energy=" + energy +
                '}';
    }
}
