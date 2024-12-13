package w3schools;

import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        //String input = "Hello";

        char[] myArray = input.toCharArray();

        System.out.println(myArray[0]);
    }
}
