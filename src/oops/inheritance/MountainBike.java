package oops.inheritance;

public class MountainBike extends Bicycle {
    private int seatHeight;

    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

    public  int getSeatHeight(){
        return this.seatHeight;
    }
}

