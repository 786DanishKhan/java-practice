package practice;

import java.util.Scanner;

public class nthFibonacciNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int x = 0, y =1, z = 0;

        for (int i = 0; i<=n; i++){
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println(z);
    }
}
