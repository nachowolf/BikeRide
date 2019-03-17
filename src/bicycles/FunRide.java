package bicycles;

import bicycles.models.BicycleFromSpec;

import java.util.ArrayList;
import java.util.List;



public class FunRide implements FunRideInterface {

    private int maxSpace;
    private List bikes = new ArrayList();

    FunRide(int max){
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
    public int getCountForType(String bike) {
        for(int i=0;i<bikes.size();i++) {
        Object currentBike = bikes.get(i);
        System.out.println(currentBike);
        }
        return 0;
    }
}
