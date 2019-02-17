package com.kot.facade;

public class AircraftFacade {

    private final Aircraft aircraft = new Aircraft();

    public void startEngine() {
        turnOnEngine();
        checkFuel();
        turnOnWeatherSystem();
    }

    public void increasePower() {
        increaseFuelPompPower();
    }

    private void increaseFuelPompPower() {

    }

    private void turnOnWeatherSystem() {
        aircraft.turOnSystems();
    }

    private void checkFuel() {

    }

    private void turnOnEngine() {
        aircraft.turnOnEngine();
    }
}
