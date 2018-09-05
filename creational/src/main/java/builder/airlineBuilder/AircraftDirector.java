package builder.airlineBuilder;

import builder.airlineBuilder.model.Plane;

public class AircraftDirector {

    private AircraftBuilder aircraftBuilder;

    public void setAircraftBuilder(AircraftBuilder aircraftBuilder) {
        this.aircraftBuilder = aircraftBuilder;
    }

    public void constructAirplane() {
        aircraftBuilder.buildCocpit();
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildWings();
        aircraftBuilder.buildName();
    }

    public Plane getPlane(){
        return aircraftBuilder.build();
    }

}
