package bicycles;

import models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeRideTest {

    @Test
    public void rideTest() {
        MountainBike bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(36, bikeRide.currentSpeed());
    }
}
