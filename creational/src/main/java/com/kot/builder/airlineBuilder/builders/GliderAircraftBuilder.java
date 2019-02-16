package com.kot.builder.airlineBuilder.builders;

import builder.airlineBuilder.model.Plane;
import com.kot.builder.airlineBuilder.AircraftBuilder;

public class GliderAircraftBuilder implements AircraftBuilder {

    public void buildEngine() {

    }

    public void buildWings() {

    }

    public void buildCockpit() {

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
