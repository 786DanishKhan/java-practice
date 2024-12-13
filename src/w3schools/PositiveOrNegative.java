package w3schools;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        //int number = -8;
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();

        if (number > 0) {
            System.out.println(number+ " is positive number");
        } else if (number < 0) {
            System.out.println(number+ " is negative number");
        } else {
            System.out.println("The value is 0");
        }
    }
}
