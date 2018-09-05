package builder.airlineBuilder;

import builder.airlineBuilder.model.Plane;

public interface AircraftBuilder {
    void buildEngine();
    void buildWings();
    void buildCocpit();
    void buildName();
    Plane build();
}
