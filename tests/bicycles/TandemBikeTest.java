package bicycles;

import models.TandemBike;
import org.junit.jupiter.api.Test;
import rides.BikeRideOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBikeTest {

    @Test
    public void tandemBikeRideOneTest() {
        TandemBike bicycle = new TandemBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(58, bikeRide.currentSpeed());
    }
}
