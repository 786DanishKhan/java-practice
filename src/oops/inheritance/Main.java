package oops.inheritance;

import java.lang.management.MonitorInfo;

public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.playMusic();
//        myCar.start();

        MountainBike myBike = new MountainBike();
        myBike.setSeatHeight(30);
        myBike.setGear(2);
        myBike.setSpeed(100);


        System.out.println("seathight: " +myBike.getSeatHeight());
        System.out.println("gear: " +myBike.getGear());
        System.out.println("speed: " +myBike.getSpeed());
        myBike.applyBreak(10);
        System.out.println("after break speed: " +myBike.getSpeed());
        myBike.speedUp(50);
        System.out.println("after speedUp: " +myBike.getSpeed());
    }
}
