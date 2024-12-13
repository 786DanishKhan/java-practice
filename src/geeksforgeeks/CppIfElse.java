package geeksforgeeks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CppIfElse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();

        if ( N > 5){
            System.out.println("Greater than 5");
        } else if ( N < 5){
            System.out.println("Less than 5");
        } else {
            System.out.println("Equal to 5");
        }
    }
}
