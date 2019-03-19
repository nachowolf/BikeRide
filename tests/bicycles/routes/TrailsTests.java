package bicycles.routes;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleSpecification;
import bicycles.models.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;





public class TrailsTests {

    BicycleSpecification tandemBikeSpec = new BicycleSpecification(BicycleType.Tandem);
    BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
    BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);

    @Test
    public void addBikesToGroupTest(){
        FunRide group = new Trails(3);
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
        FunRide group = new Trails(5);
        BicycleFromSpec tandem1 = new BicycleFromSpec(tandemBikeSpec);
        group.addBike(tandem1);
        assertEquals(1, group.getEnteredCount());
    }

    @Test
   public void countMoreAddedBikes(){
        FunRide group = new Trails(5);
        BicycleFromSpec tandem1 = new BicycleFromSpec(tandemBikeSpec);
        BicycleFromSpec tandem2 = new BicycleFromSpec(tandemBikeSpec);
        BicycleFromSpec mountainbike1 = new BicycleFromSpec(mountainBikeSpec);
        BicycleFromSpec roadbike1 = new BicycleFromSpec(roadBikeSpec);
        group.addBike(tandem1);
        group.addBike(tandem2);
        group.addBike(mountainbike1);
        group.addBike(roadbike1);
        assertEquals(4, group.getEnteredCount());
    }

    @Test
public void countAllSpecificBike(){
        FunRide group = new Trails(10);
        BicycleFromSpec tandem1 = new BicycleFromSpec(tandemBikeSpec);
        BicycleFromSpec tandem2 = new BicycleFromSpec(tandemBikeSpec);
        BicycleFromSpec mountainbike1 = new BicycleFromSpec(mountainBikeSpec);
        BicycleFromSpec mountainbike2 = new BicycleFromSpec(mountainBikeSpec);
        BicycleFromSpec mountainbike3 = new BicycleFromSpec(mountainBikeSpec);
        BicycleFromSpec roadbike1 = new BicycleFromSpec(roadBikeSpec);
        group.addBike(tandem1);
        group.addBike(tandem2);
        group.addBike(mountainbike1);
        group.addBike(mountainbike2);
        group.addBike(mountainbike3);
        group.addBike(roadbike1);
        assertEquals(2, group.getCountForType(BicycleType.Tandem));
        assertEquals(3, group.getCountForType(BicycleType.MountainBike));
        assertEquals(1, group.getCountForType(BicycleType.RoadBike));
    }


}
