package com.kot.builder.airlineBuilder;

import builder.airlineBuilder.model.Plane;

public interface AircraftBuilder {
    void buildEngine();
    void buildWings();
    void buildCockpit();
    void buildName();
    Plane build();
}
