package bicycles;

public class Bicycle {
    private int speed = 0;

    public void accelerate(){
        this.speed += 5;
    }
    public void brake(){
        this.speed -= 3;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void stop(){
        this.speed = 0;
    }
}
