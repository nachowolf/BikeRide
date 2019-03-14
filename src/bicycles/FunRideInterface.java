package bicycles;

import bicycles.models.BicycleFromSpec;

public interface FunRideInterface {

    //Add bike
    String addBike(BicycleFromSpec bike);

    //Count all bikes in BikeRide
    int getEnteredCount();

    //Count all specific bikes in BikeRide
    int getCountForType(String bike);
}
