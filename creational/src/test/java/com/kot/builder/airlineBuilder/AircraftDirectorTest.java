package com.kot.builder.airlineBuilder;

import builder.airlineBuilder.model.Plane;
import com.kot.builder.airlineBuilder.builders.GliderAircraftBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftDirectorTest {

    @Test
    void getPlane() {
        //given
        AircraftDirector aircraftDirector = new AircraftDirector();
        AircraftBuilder aircraftBuilder = new GliderAircraftBuilder();

        //when
        Plane plane = aircraftDirector.getPlane(aircraftBuilder);

        //then
        assertEquals("GLIDER", plane.getPlaneName());
    }
}