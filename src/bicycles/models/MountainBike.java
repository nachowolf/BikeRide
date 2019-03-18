package bicycles.models;
public class MountainBike extends BicycleBase {

    private int mountainBikeAccelerateSpeed = 5;
    private int mountainBikeBrakeSpeed = -3;



//    @Override
    public void accelerate() {
        changeSpeed(mountainBikeAccelerateSpeed);
    }

//    @Override
    public void brake() {
     changeSpeed(mountainBikeBrakeSpeed);
    }

//    @Override
//    public int getSpeed() {
//        return speed;
//    }
//
//    @Override
//    public void stop() {
//     speed = 0;
//    }
}
