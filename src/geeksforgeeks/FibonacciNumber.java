package geeksforgeeks;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();
            int y = nthFibonacci(n);
        System.out.println(y);
        }

    public static int nthFibonacci(int n) {
        // code here
        int x=0,y=1,z=0;
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i = 0;i<=n;i++){
           z = x + y;
           x = y;
           y = z;
        }
        return y;
    }
}