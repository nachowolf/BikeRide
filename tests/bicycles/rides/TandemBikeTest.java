package bicycles.rides;

import models.TandemBike;
import org.junit.jupiter.api.Test;
import rides.BikeRideOne;
import rides.BikeRideThree;
import rides.BikeRideTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemBikeTest {

    @Test
    public void tandemBikeRideOneTest() {
        TandemBike bicycle = new TandemBike();
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(58, bikeRide.currentSpeed());
    }

    @Test
    public void tandemBikeRideTwoTest() {
        TandemBike bicycle = new TandemBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        assertEquals(15, bikeRide.currentSpeed());
    }

    @Test
    public void tandemBikeRideThreeTest() {
        TandemBike bicycle = new TandemBike();
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();
        assertEquals(3, bikeRide.currentSpeed());
    }
}
