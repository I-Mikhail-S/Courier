package org.example.time;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class TimeBuilderTest {

    @org.junit.jupiter.api.Test
    void getSecondIsWork() throws ParseException {
        assertEquals(TimeBuilder.getTime("12:и0","13:01"),61);
    }
}