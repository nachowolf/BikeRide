package bicycles.models;

     public interface Bicycle {

//    int speed = 0;

    //increase bike speed
     void accelerate();

    //decrease bike speed
    void brake();

    //get bike current speed
    int getSpeed();

    //get bike type
    BicycleType getBicycleType();

    //stop bike
    void stop();
}
