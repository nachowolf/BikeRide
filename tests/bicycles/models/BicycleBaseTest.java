package bicycles.models;

import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleBaseTest {

    BicycleSpecification tandemBikeSpec = new BicycleSpecification(BicycleType.Tandem);
    BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
    BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);


    @Test
    public void createARoadBike(){
       BicycleFromSpec bicycle = new BicycleFromSpec(roadBikeSpec);
       assertEquals(0, bicycle.getSpeed());
        assertEquals("RoadBike", bicycle.getBicycleType());

    }

    @Test
    public void createAMountainBike(){
        BicycleFromSpec bicycle = new BicycleFromSpec(mountainBikeSpec);
        assertEquals(0, bicycle.getSpeed());
        assertEquals("MountainBike", bicycle.getBicycleType());

    }
    @Test
    public void createATandemBike(){
        BicycleFromSpec bicycle = new BicycleFromSpec(tandemBikeSpec);
        assertEquals(0, bicycle.getSpeed());
        assertEquals("Tandem", bicycle.getBicycleType());

    }
}
