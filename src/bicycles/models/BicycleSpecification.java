package bicycles.models;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;

    BicycleSpecification(int acceleration, int brake){
        this.accelerationSpeed = acceleration;
        this.brakeSpeed = brake;
    }

    public int getAccelerationSpeed(){
        return this.accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return brakeSpeed;
    }
}
