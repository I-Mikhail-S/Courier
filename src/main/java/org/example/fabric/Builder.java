package org.example.fabric;

import org.example.courier.CourierBike;
import org.example.courier.CourierCar;
import org.example.courier.CourierPeople;
import org.example.enums.EnumCourier;
import org.example.person.Person;

public class Builder {

    Person person;

    public Builder(EnumCourier type) throws Exception {

        person = new Factory().getNewCourier(type);
    }

    public Builder energy(double energy) {

        person.setEnergy(energy);
        return this;
    }

    public Builder name(String name) {

        person.setName(name);
        return this;
    }

    public Builder id(int id) {

        person.setId(id);
        return this;
    }

    public Builder speed(double speed) {

        person.setSpeed(speed);
        return this;
    }
    public Builder isFree(boolean free){
        person.setSetIsFree(free);
        return this;
    }
    public Person build() {

        return person;
    }


    private class Factory {

        Person getNewCourier(EnumCourier enumCourier) throws Exception {
            Person person = null;

            switch (enumCourier) {
                case CAR:
                    person = new CourierCar();
                    break;
                case BIKE:
                    person = new CourierBike();
                    break;
                case PEOPLE:
                    person = new CourierPeople();
                    break;
                default:
                    throw new Exception("Invalid product type!");
            }

            return person;
        }
        Person getNewCourier(int id,String name,double speed,double energy,EnumCourier enumCourier) throws Exception {
            Person person = null;

            switch (enumCourier) {
                case CAR:
                    person = new CourierCar(id,name,speed,energy);
                    break;
                case BIKE:
                    person = new CourierBike(id,name,speed,energy);
                    break;
                case PEOPLE:
                    person = new CourierPeople(id,name,speed,energy);
                    break;
                default:
                    throw new Exception("Invalid product type!");
            }

            return person;
        }
    }
}
