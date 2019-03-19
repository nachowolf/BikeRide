package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {

    BicycleSpecification tandemBikeSpec = new BicycleSpecification(BicycleType.Tandem);
    BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
    BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);

    @Test
    public void checkIfMountainBikeIsCreated(){
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpec);
        mountainBike.accelerate();
        assertEquals(5, mountainBike.getSpeed());
        mountainBike.stop();
        assertEquals(0, mountainBike.getSpeed());
        assertEquals("MountainBike", mountainBike.getBicycleType());
    }

    @Test
    public void checkIfRoadBikeIsCreated(){
        BicycleFromSpec roadBike = new BicycleFromSpec(roadBikeSpec);
        roadBike.accelerate();
        assertEquals(11, roadBike.getSpeed());
        roadBike.stop();
        assertEquals(0, roadBike.getSpeed());
        assertEquals("RoadBike", roadBike.getBicycleType());
    }

    @Test
    public void checkIfTandemBikeIsCreated(){
        BicycleFromSpec tandemBike = new BicycleFromSpec(tandemBikeSpec);
        tandemBike.accelerate();
        assertEquals(12, tandemBike.getSpeed());
        tandemBike.stop();
        assertEquals(0, tandemBike.getSpeed());
        assertEquals("Tandem", tandemBike.getBicycleType());
    }
}
