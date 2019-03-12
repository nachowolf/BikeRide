package models;

import bicycles.BicycleBase;

public class TandemBike extends BicycleBase {

    private int tandemAccelerate = 12;
    private int tandemBrake = -7;



    public void accelerate(){
        changeSpeed(tandemAccelerate);
    }

    public void brake(){
        changeSpeed(tandemBrake);
    }
}
