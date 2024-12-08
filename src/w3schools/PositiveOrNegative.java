package w3schools;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int number = -8;

        if (number > 0) {
            System.out.println(number+ " is positive number");
        } else if (number < 0) {
            System.out.println(number+ "is negative number");
        } else {
            System.out.println("The value is 0");
        }
    }
}
