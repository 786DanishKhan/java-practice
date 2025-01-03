package oops.inheritance;

public class Bicycle {
    private int gear;
    private int speed;

    public void setGear(int gear){
        this.gear = gear;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getGear(){
        return this.gear;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void applyBreak(int decrement){
        speed = speed - decrement;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }
}
