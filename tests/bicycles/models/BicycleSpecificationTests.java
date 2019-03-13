package bicycles.models;

import bicycles.Bicycle;
import bicycles.BikeRide;
import rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTests {

    @Test
    public void bicycleSpecificationTest(){
        BicycleSpecification bike = new BicycleSpecification(5, -3);
        assertEquals(5, bike.getAccelerationSpeed());
        assertEquals(-3, bike.getBrakeSpeed());
    }

    @Test
    public void roadBicycleSpecificationTest(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(58, bikeRide.currentSpeed());
//        assertEquals(11, bikeRide.getAccelerationSpeed());
//        assertEquals(-4, bikeRide.getBrakeSpeed());
    }

    @Test
    public void mountainBicycleSpecificationTest(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(24, bikeRide.currentSpeed());
//        assertEquals(5, bikeRide.getAccelerationSpeed());
//        assertEquals(-3, bikeRide.getBrakeSpeed());
    }

    @Test
    public void tandemBicycleSpecificationTest(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7);
        Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(58, bikeRide.currentSpeed());
//        assertEquals(11, bikeRide.getAccelerationSpeed());
//        assertEquals(-4, bikeRide.getBrakeSpeed());
    }
}
