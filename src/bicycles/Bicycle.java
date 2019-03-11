package bicycles;

     public interface Bicycle {

    int speed = 0;

    //increase bike speed
     void accelerate();

    //decrease bike speed
    void brake();

    //get bike current speed
    int getSpeed();

    //stop bike
    void stop();
}
