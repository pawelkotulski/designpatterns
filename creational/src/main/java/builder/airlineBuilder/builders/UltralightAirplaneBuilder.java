package builder.airlineBuilder.builders;

import builder.airlineBuilder.AircraftBuilder;
import builder.airlineBuilder.model.Plane;

public class UltralightAirplaneBuilder implements AircraftBuilder {

    private String name;

    public void buildEngine() {

    }

    public void buildWings() {

    }

    public void buildCocpit() {

    }

    public void buildName() {
        this.name = "ULC";
    }

    public Plane build() {
        Plane plane = new Plane();
        plane.setPlaneName(name);
        return plane;
    }
}
