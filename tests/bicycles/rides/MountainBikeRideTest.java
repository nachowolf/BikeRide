package bicycles.rides;

import bicycles.models.*;
import rides.BikeRideOne;
import rides.BikeRideTwo;
import rides.BikeRideThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeRideTest {

    @Test
    public void mountainBikeRideOneTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(24, bikeRide.currentSpeed());
    }

    @Test
    public void mountainBikeRideTwoTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        assertEquals(6, bikeRide.currentSpeed());
    }

    @Test
    public void mountainBikeRideThreeTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();
        assertEquals(1, bikeRide.currentSpeed());
    }
}
