package w3schools.oops;

public class AccessMethodWithObject {
    public void fullThrottle() {
        System.out.println("The car is going as fast");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is:" + maxSpeed);
    }
}
 class test{
    public static void main(String[] args) {
        AccessMethodWithObject myCar = new AccessMethodWithObject();
        myCar.fullThrottle();
        myCar.speed(200);
    }
    }

