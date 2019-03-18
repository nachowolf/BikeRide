package bicycles.rides;



import models.RoadBike;
import org.junit.jupiter.api.Test;
import rides.BikeRideOne;
import rides.BikeRideTwo;
import rides.BikeRideThree;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeRideTest {
    @Test
    public void roadBikeRideOneTest() {
        RoadBike bicycle = new RoadBike();
        BikeRideOne bikeRide = new rides.BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(58, bikeRide.currentSpeed());
    }

    @Test
    public void roadBikeRideTwoTest() {
        RoadBike bicycle = new RoadBike();
        BikeRideTwo bikeRide = new rides.BikeRideTwo(bicycle);
        bikeRide.ride();
        assertEquals(21, bikeRide.currentSpeed());
    }
@Test
    public void roadBikeRideThreeTest() {
        RoadBike bicycle = new RoadBike();
        BikeRideThree bikeRide = new rides.BikeRideThree(bicycle);
        bikeRide.ride();
        assertEquals(10, bikeRide.currentSpeed());
    }

}
