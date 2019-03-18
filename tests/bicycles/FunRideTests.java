package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

;



public class FunRideTests {

    BicycleSpecification tandemBikeSpec = new BicycleSpecification("Tandem");
    BicycleSpecification roadBikeSpec = new BicycleSpecification("RoadBike");
    BicycleSpecification mountainBikeSpec = new BicycleSpecification("MountainBike");

    @Test
    public void addBikesToGroupTest(){
        FunRide group = new FunRide(3);
        BicycleFromSpec tandem1 = new BicycleFromSpec(tandemBikeSpec);
        BicycleFromSpec tandem2 = new BicycleFromSpec(tandemBikeSpec);
        BicycleFromSpec tandem3 = new BicycleFromSpec(tandemBikeSpec);
        BicycleFromSpec tandem4 = new BicycleFromSpec(tandemBikeSpec);
        assertEquals("accepted", group.addBike(tandem1));
        assertEquals("accepted", group.addBike(tandem2));
        assertEquals("accepted", group.addBike(tandem3));
        assertEquals("declined", group.addBike(tandem4));
    }

    @Test
public void countAllBikesAddedTest(){
        FunRide group = new FunRide(5);
        BicycleFromSpec tandem1 = new BicycleFromSpec(tandemBikeSpec);
        group.addBike(tandem1);
        assertEquals(1, group.getEnteredCount());
    }

    @Test
   public void countMoreAddedBikes(){
        FunRide group = new FunRide(5);
        BicycleFromSpec tandem1 = new BicycleFromSpec(tandemBikeSpec);
        group.addBike(tandem1);
        BicycleFromSpec tandem2 = new BicycleFromSpec(tandemBikeSpec);
        group.addBike(tandem2);
        BicycleFromSpec mountainbike1 = new BicycleFromSpec(mountainBikeSpec);
        group.addBike(mountainbike1);
        BicycleFromSpec roadbike1 = new BicycleFromSpec(roadBikeSpec);
        group.addBike(roadbike1);
        assertEquals(4, group.getEnteredCount());
    }

    @Test
public void countAllSpecificBike(){
        FunRide group = new FunRide(10);
        BicycleFromSpec tandem1 = new BicycleFromSpec(tandemBikeSpec);
        group.addBike(tandem1);
        BicycleFromSpec tandem2 = new BicycleFromSpec(tandemBikeSpec);
        group.addBike(tandem2);
        BicycleFromSpec mountainbike1 = new BicycleFromSpec(mountainBikeSpec);
        group.addBike(mountainbike1);
        BicycleFromSpec mountainbike2 = new BicycleFromSpec(mountainBikeSpec);
        group.addBike(mountainbike2);
        BicycleFromSpec mountainbike3 = new BicycleFromSpec(mountainBikeSpec);
        group.addBike(mountainbike3);
        BicycleFromSpec roadbike1 = new BicycleFromSpec(roadBikeSpec);
        group.addBike(roadbike1);
        assertEquals(2, group.getCountForType("Tandem"));
        assertEquals(3, group.getCountForType("MountainBike"));
        assertEquals(1, group.getCountForType("RoadBike"));
    }


}
