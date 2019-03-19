package bicycles.specification;

import bicycles.models.BicycleType;

public class BicycleSpecification {


    private BicycleType bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(BicycleType bicycleType){
        this.bicycleType = bicycleType;
        if(bicycleType == BicycleType.RoadBike){
            this.accelerationSpeed = 11;
            this.brakeSpeed = -4;
        }
        else if(bicycleType == BicycleType.MountainBike){
            this.accelerationSpeed = 5;
            this.brakeSpeed = -3;
        }
        else if(bicycleType == BicycleType.Tandem) {
            this.accelerationSpeed = 12;
            this.brakeSpeed = -7;
        }
    }

    public String getBicycleType() {
        return this.bicycleType.toString();
    }

    public int getAccelerationSpeed(){
        return this.accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return this.brakeSpeed;
    }


}
