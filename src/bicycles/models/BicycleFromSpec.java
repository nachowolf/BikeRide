package bicycles.models;

import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {

    private BicycleSpecification bicycle;

    BicycleFromSpec(BicycleSpecification bike){
        this.bicycle = bike;
    }

    @Override
    public void accelerate() {
        changeSpeed(this.bicycle.getAccelerationSpeed());
    }

    @Override
    public void brake() {
changeSpeed(this.bicycle.getBrakeSpeed());
    }

    public void bikeType(){

    }
}
