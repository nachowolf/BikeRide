package bicycles;
import bicycles.models.BicycleFromSpec;

public class FunRide implements FunRideInterface {

    private int maxSpace;
    BicycleFromSpec [] bikes = new BicycleFromSpec[maxSpace];

    FunRide(int max){
        this.maxSpace = max;
    }

    @Override
    public String addBike(BicycleFromSpec bike) {
//        if(bikes.length < maxSpace){
           Object bikes[0] = bike;
//            return "accepted";
//        }
//        else{
//            return "rejected";
//        }
        return "accepted";
    }

    @Override
    public int getEnteredCount() {
        return bikes.length;
    }

    @Override
    public int getCountForType(String bike) {
        return 0;
    }
}
