package bicycles;

import bicycles.models.MountainBike;

import org.junit.jupiter.api.Test;
import rides.BikeRideOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void rideTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(24, bikeRide.currentSpeed());
    }

}
