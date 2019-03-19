package bicycles.models;

public class BicycleFromSpec extends BicycleBase {

    private BicycleSpecification bicycle;

    public BicycleFromSpec(BicycleSpecification bike){
        this.bicycle = bike;
        setBikeType(this.bicycle.getBicycleType());
    }

    @Override
    public void accelerate() {
        changeSpeed(this.bicycle.getAccelerationSpeed());
    }

    @Override
    public void brake() {
changeSpeed(this.bicycle.getBrakeSpeed());
    }


}
