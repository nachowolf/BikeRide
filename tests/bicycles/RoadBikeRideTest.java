package bicycles;


import models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeRideTest {
    @Test
    public void rideTest() {
        RoadBike bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(36, bikeRide.currentSpeed());
    }
}
