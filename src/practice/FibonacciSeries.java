package practice;
//Done
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println("Fibonacci series up to" +n+ "terms");

        int first = 0, second = 1;

        for (int i = 0; i<n; i++){
            System.out.println(first+ " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
