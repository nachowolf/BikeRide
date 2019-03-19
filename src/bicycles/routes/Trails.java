package bicycles.routes;

import bicycles.models.Bicycle;
import bicycles.models.BicycleType;
import bicycles.specification.BicycleFromSpec;

import java.util.ArrayList;
import java.util.List;



public class Trails implements FunRide {

    private int maxSpace;
    private List<Bicycle> bikes = new ArrayList<>();

    Trails(int max){
        this.maxSpace = max;
    }

    @Override
    public String addBike(BicycleFromSpec bike) {

        if(bikes.size() < maxSpace){
           bikes.add(bike);
            return "accepted";
        }
        else{
            return "declined";
        }

    }

    @Override
    public int getEnteredCount() {
        return bikes.size();
    }

    @Override
    public int getCountForType(BicycleType bikeType) {
        int counted = 0;
        for (Bicycle bicycle : bikes) {
            if(bicycle.getBicycleType() == bikeType){
                counted++;
            }
        }
        return counted;
    }
}
