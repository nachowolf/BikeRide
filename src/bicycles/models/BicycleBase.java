package bicycles.models;

public abstract class BicycleBase implements Bicycle {

    private int speed = 0;
    private String bikeType;

    protected void changeSpeed(int speeder){
        speed += speeder;
        if(this.speed < 0){
            this.speed = 0;
        }
    }

   protected void setBikeType(String bike){
        this.bikeType = bike;
   }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getBicycleType() {
        return bikeType;
    }

    @Override
    public void stop() {
     speed = 0;
    }
}
