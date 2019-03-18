package bicycles.models;

public class BicycleSpecification {

    enum BicycleType {
        RoadBike,
        MountainBike,
        Tandem
    }

    private String bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification( String bicycleType){
        this.bicycleType = bicycleType;
        if(bicycleType == BicycleType.RoadBike.toString()){
            this.accelerationSpeed = 11;
            this.brakeSpeed = -4;
        }
        else if(bicycleType == BicycleType.MountainBike.toString()){
            this.accelerationSpeed = 5;
            this.brakeSpeed = -3;
        }
        else if(bicycleType == BicycleType.Tandem.toString()) {
            this.accelerationSpeed = 12;
            this.brakeSpeed = -7;
        }
    }

    public String getBicycleType() {
        return this.bicycleType;
    }

    public int getAccelerationSpeed(){
        return this.accelerationSpeed;
    }

    public int getBrakeSpeed() {
        return this.brakeSpeed;
    }


}
