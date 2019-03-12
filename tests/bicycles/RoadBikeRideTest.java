package bicycles;


import models.RoadBike;
import org.junit.jupiter.api.Test;
import rides.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeRideTest {
    @Test
    public void roadBikeRideOneTest() {
        RoadBike bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(58, bikeRide.currentSpeed());
    }

    @Test
    public void roadBikeRideTwoTest() {
        RoadBike bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(21, bikeRide.currentSpeed());
    }

}
