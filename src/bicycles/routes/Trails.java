package bicycles.routes;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleType;
import java.util.ArrayList;
import java.util.List;



public class Trails implements FunRide {

    private int maxSpace;
    private List bikes = new ArrayList();

    Trails(int max){
        this.maxSpace = max;
    }

    @Override
    public String addBike(BicycleFromSpec bike) {

        if(bikes.size() < maxSpace){
           bikes.add(bike.getBicycleType());
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
        for(int i=0;i<bikes.size();i++) {
        Object currentBike = bikes.get(i);
        if(currentBike == bike){
            counted++;
        }
        }
        return counted;
    }
}
