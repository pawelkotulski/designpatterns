package com.kot.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftFacadeTest {

    @Test
    void startEngine() {
        //given
        AircraftFacade aircraftFacade = new AircraftFacade();

        //when
        aircraftFacade.startEngine();
        aircraftFacade.increasePower();

    }
}