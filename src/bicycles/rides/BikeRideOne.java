package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideOne implements BikeRide {

    private Bicycle bicycle;


    public BikeRideOne(Bicycle bike) {
        bicycle = bike;
    }

    @Override
    public void ride() {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.accelerate();
    }

    @Override
    public int currentSpeed() {
        return bicycle.getSpeed();
    }
}
