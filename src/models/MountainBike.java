package models;

public class MountainBike implements bicycles.Bicycle {

    private int mountainBikeAccelerateSpeed = 5;
    private int mountainBikeBrakeSpeed = 3;
    private int speed = 0;


    @Override
    public void accelerate() {
        speed += mountainBikeAccelerateSpeed;
    }

    @Override
    public void brake() {
     speed -= mountainBikeBrakeSpeed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void stop() {
     speed = 0;
    }
}
