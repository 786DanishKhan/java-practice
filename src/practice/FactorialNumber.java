package practice;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int factorial = 1;

        for (int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " +n+ " is:" +factorial);
    }
}
