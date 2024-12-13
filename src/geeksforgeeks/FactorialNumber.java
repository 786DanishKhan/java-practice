package geeksforgeeks;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number to find its factorial: ");
         int num = obj.nextInt();

         int factorial = 1;

         for (int i = num; i>=1; i--){
             factorial *= i;
    }
        System.out.println("factorial of " +num +" is: " + factorial);
    }
    }
