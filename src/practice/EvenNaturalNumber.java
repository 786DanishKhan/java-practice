package practice;

import java.util.Scanner;
//Done
public class EvenNaturalNumber {
    public static void main(String[] args) {
        int sum = 0;
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int n = 10;
        for (int i = 1; i<=n; i++){
            if(i%2==0){
            sum = sum + i;
            }
        }
        System.out.println("Sum of first " +n+ " even natural number :" +sum);
    }
}
