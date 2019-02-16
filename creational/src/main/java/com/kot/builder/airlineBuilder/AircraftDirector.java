package com.kot.builder.airlineBuilder;

import builder.airlineBuilder.model.Plane;

public class AircraftDirector {

    private void constructAirplane(AircraftBuilder aircraftBuilder) {
        aircraftBuilder.buildCockpit();
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildWings();
        aircraftBuilder.buildName();
    }

    public Plane getPlane(AircraftBuilder aircraftBuilder){
        constructAirplane(aircraftBuilder);
        return aircraftBuilder.build();
    }

}
