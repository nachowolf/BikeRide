package bicycles;

public class BicycleBase extends Bicycle{

    private int speed = 0;

    protected void changeSpeed(int accelerate){
        this.speed += accelerate;
    }
}
