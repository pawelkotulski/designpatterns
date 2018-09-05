package builder.airlineBuilder.builders;

import builder.airlineBuilder.AircraftBuilder;
import builder.airlineBuilder.model.Plane;

public class GliderAircraftBuilder implements AircraftBuilder{

    public void buildEngine() {

    }

    public void buildWings() {

    }

    public void buildCocpit() {

    }

    public void buildName() {

    }

    public Plane build()
    {
        Plane plane = new Plane();
        plane.setPlaneName("GLIDER");
        return plane;
    }
}
