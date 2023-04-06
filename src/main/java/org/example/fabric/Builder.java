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

        person.setEnergy(id);
        return this;
    }

    public Builder speed(double speed) {

        person.setSpeed(speed);
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
    }
}
