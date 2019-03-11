package bicycles;

import models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {

    @Test
    public void rideTest() {
        Tandem bicycle = new Tandem();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(34, bikeRide.currentSpeed());
    }
}
