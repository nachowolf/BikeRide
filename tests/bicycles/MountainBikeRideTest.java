package bicycles;

import models.MountainBike;
import org.junit.jupiter.api.Test;
import rides.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeRideTest {

    @Test
    public void mountainBikeRideOneTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(24, bikeRide.currentSpeed());
    }

    @Test
    public void mountainBikeRideTwoTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(6, bikeRide.currentSpeed());
    }

    @Test
    public void mountainBikeRideThreeTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(-2, bikeRide.currentSpeed());
    }
}
