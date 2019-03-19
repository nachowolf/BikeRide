package bicycles.specification;

import bicycles.BikeRide;
import bicycles.models.Bicycle;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;
import rides.BikeRideOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTests {

    @Test
    public void bicycleSpecificationTest(){
        BicycleSpecification bike = new BicycleSpecification(BicycleType.RoadBike);
        assertEquals(11, bike.getAccelerationSpeed());
        assertEquals(-4, bike.getBrakeSpeed());
        assertEquals("RoadBike", bike.getBicycleType());
    }

    @Test
    public void roadBicycleSpecificationTest(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(58, bikeRide.currentSpeed());
        assertEquals("RoadBike", bicycle.getBicycleType());
//        assertEquals(11, bikeRide.getAccelerationSpeed());
//        assertEquals(-4, bikeRide.getBrakeSpeed());
    }

    @Test
    public void mountainBicycleSpecificationTest(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(24, bikeRide.currentSpeed());
        assertEquals("MountainBike", bicycle.getBicycleType());
//        assertEquals(5, bikeRide.getAccelerationSpeed());
//        assertEquals(-3, bikeRide.getBrakeSpeed());
    }

    @Test
    public void tandemBicycleSpecificationTest(){
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();
        assertEquals(58, bikeRide.currentSpeed());
        assertEquals("Tandem", bicycle.getBicycleType());
//        assertEquals(11, bikeRide.getAccelerationSpeed());
//        assertEquals(-4, bikeRide.getBrakeSpeed());
    }
}
