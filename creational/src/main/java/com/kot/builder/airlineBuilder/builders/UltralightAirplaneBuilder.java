package com.kot.builder.airlineBuilder.builders;

import builder.airlineBuilder.model.Plane;
import com.kot.builder.airlineBuilder.AircraftBuilder;

public class UltralightAirplaneBuilder implements AircraftBuilder {

    private String name;

    public void buildEngine() {

    }

    public void buildWings() {

    }

    public void buildCockpit() {

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
