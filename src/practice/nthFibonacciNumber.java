package practice;
//The fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
import java.util.Scanner;

public class nthFibonacciNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println("Enter nthFibonacci number:" +n);

        int first = 0, second =1, temp = 0;

        for (int i = 0; i<n; i++){
            temp = first + second;
            first = second;
            second = temp;
        }
        System.out.println(temp);
    }
}
