package w3schools;

import java.util.Scanner;
//Already Done
public class EvenOrOdd {
    public static void main(String[] args) {
        //int number = 10;
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
