package geeksforgeeks;

import java.util.Scanner;
//final
public class Calculator {
    public static void main(String[] args) {
       // int a = 15;//initialize
       // int b = 20;
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println(add(a,b));
        System.out.println(subtract(a,b));
        System.out.println(product(a,b));
        System.out.println(mod(a,b));
        System.out.println(divide(a,b));
    }

     static int subtract(int a, int b) {
        return a-b;
    }

    static int add(int a, int b){
        return a+b;
    }

    static int product (int a, int b){
        return a*b;
    }

    static int mod (int a, int b){
        return  a%b;
    }

    static int divide (int a, int b){
        return a/b;
    }
}
