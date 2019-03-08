package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    @Test
    public void rideTest() {
        Bicycle bicycle = new Bicycle();
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
        System.out.println(bikeRide.currentSpeed());
        assertEquals(14, bikeRide.currentSpeed());
    }

}
