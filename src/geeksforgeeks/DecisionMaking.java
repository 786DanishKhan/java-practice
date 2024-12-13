package geeksforgeeks;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        //int n = 4;
        //int m = 8;

        if (n < m){
            System.out.println("lesser");
        } else if ( n == m){
            System.out.println("Equal");
        }else {
            System.out.println("Greater");
        }
    }
}
