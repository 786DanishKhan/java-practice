package geeksforgeeks;

public class AreaOfCircle {
    private static final double pi = 3.14159;
    private double radius;

    public AreaOfCircle(double radius){
        this.radius = radius;
    }

    public double gerArea(){
        return pi * radius * radius;
    }

    public static String test(){
        System.out.println("From test");
        return "from test";
    }

    public static void main(String[] args) {
        AreaOfCircle obj = new AreaOfCircle(5.0);

        System.out.print("Area of Circle:" +obj.gerArea());
        System.out.println(test());
    }
}
