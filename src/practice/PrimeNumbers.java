package practice;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            int count = 0;
            for (int j = 1; j<=num; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+ " ");
            }
        }
    }
}
