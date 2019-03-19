package bicycles.routes;

import bicycles.specification.BicycleFromSpec;
import bicycles.models.BicycleType;

public interface FunRide {

    //Add bike
    String addBike(BicycleFromSpec bike);

    //Count all bikes in BikeRide
    int getEnteredCount();

    //Count all specific bikes in BikeRide
    int getCountForType(BicycleType bike);
}
