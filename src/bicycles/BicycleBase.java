package bicycles;

public abstract class BicycleBase implements Bicycle {

    private int speed = 0;

    protected void changeSpeed(int speeder){
        speed += speeder;
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
