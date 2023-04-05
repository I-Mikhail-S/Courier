package org.example.time;

import static org.junit.jupiter.api.Assertions.*;

class TimeBuilderTest {

    @org.junit.jupiter.api.Test
    void getSecond() {
        assertEquals(TimeBuilder.getTime("12:00","13:00"),3600);
    }
}