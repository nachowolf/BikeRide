package models;

import bicycles.models.BicycleBase;

public class RoadBike extends BicycleBase {
    private int roadBikeAccelerateSpeed = 11;
    private int roadBikeBrakeSpeed = -4;



//    @Override
    public void accelerate() {
        changeSpeed(roadBikeAccelerateSpeed);
    }

//    @Override
    public void brake() {
        changeSpeed(roadBikeBrakeSpeed);
    }

//    @Override
//    public int getSpeed() {
//        return speed;
//    }

//    @Override
//    public void stop() {
//        speed = 0;
//    }
}
