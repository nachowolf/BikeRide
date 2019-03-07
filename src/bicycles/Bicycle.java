package bicycles;

public class Bicycle {
    private int speed = 0;

    public void accelerate(){
        speed += 5;
    }
    public void brake(){
        speed -= 3;
    }
    public int currentSpeed(){
        return speed;
    }
    public void stop(){
        speed = 0;
    }
}
