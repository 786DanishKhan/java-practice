package geeksforgeeks;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        String c = compareNM(n , m);
        System.out.println(c);
    }
    public static String compareNM (int n, int m) {
        // code here
        if (n < m) {
            return n+" is lesser than" +m;
        } else if (n == m) {
            return n+" is equal than " +m;
        } else {
            return n+ " is greater than " +m;
        }
    }
}
