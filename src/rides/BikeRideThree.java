package rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideThree implements BikeRide {

    private Bicycle bicycle;


    public BikeRideThree(Bicycle bike) {
        bicycle = bike;
    }

    @Override
    public void ride() {
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.brake();
    }

    @Override
    public int currentSpeed() {
        return bicycle.getSpeed();
    }
}
