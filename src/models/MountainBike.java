package models;

public class MountainBike implements bicycles.Bicycle {

    private int roadBikeAccelerateSpeed = 11;
    private int roadBikeBrakeSpeed = 4;
    private int speed = 0;


    @Override
    public void accelerate() {
        speed += roadBikeAccelerateSpeed;
    }

    @Override
    public void brake() {
     speed -= roadBikeBrakeSpeed;
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
