package bicycles.rides;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;
import rides.BikeRideOne;
import rides.BikeRideTwo;
import rides.BikeRideThree;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void bikeRideOneTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(24, bikeRide.currentSpeed());
    }

    @Test
    public void bikeRideTwoTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        assertEquals(6, bikeRide.currentSpeed());
    }

    @Test
    public void bikeRideThreeTest() {
        MountainBike bicycle = new MountainBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();
        assertEquals(1, bikeRide.currentSpeed());
    }

}
