package bicycles.routes;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleType;

import java.util.ArrayList;
import java.util.List;



public class Trails implements FunRide {

    private int maxSpace;
    private List<Object> bikes = new ArrayList<Object>();

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
    public int getCountForType(BicycleType bike) {
        int counted = 0;
        for (Object i : bikes) {
            BicycleFromSpec bicycle = (BicycleFromSpec) i;
            if(bicycle.getBicycleType() == bike.toString()){
                counted++;
            }
        }
        return counted;
    }
}
