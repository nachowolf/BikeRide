package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideTwo implements BikeRide {


    private Bicycle bicycle;


    public BikeRideTwo(Bicycle bike) {
        bicycle = bike;
    }

    @Override
    public void ride() {
     bicycle.accelerate();
     bicycle.brake();
     bicycle.accelerate();
     bicycle.brake();
     bicycle.accelerate();
     bicycle.brake();
    }

    @Override
    public int currentSpeed() {
        return bicycle.getSpeed();
    }
}
