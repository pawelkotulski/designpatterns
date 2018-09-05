package builder.airlineBuilder;

import builder.airlineBuilder.builders.GliderAircraftBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftDirectorTest {

    @Test
    void constructAirplane() {
        //given
        AircraftDirector aicraftDirector = new AircraftDirector();
        aicraftDirector.setAircraftBuilder(new GliderAircraftBuilder());

        //when
        aicraftDirector.constructAirplane();

        //then
        assertEquals("GLIDER", aicraftDirector.getPlane().getPlaneName());
    }


}