package org.example.fabricPerson;

import org.example.enumType.EnumCourier;
import org.example.person.Person;
import org.junit.jupiter.api.Test;

import static org.example.enumType.EnumCourier.*;
import static org.junit.jupiter.api.Assertions.*;

class BuilderPersonTest {

   @Test
    public void testBuilder() throws Exception {
       Person carPeople = new BuilderPerson(EnumCourier.BIKE).id(12).speed(123).energy(23).name("Stepan").isFree(true).build();
       ;
   }
}