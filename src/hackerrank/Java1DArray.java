package hackerrank;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();//user input
        //int n = 20;//hardcode
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i<n; i++){
            a[i] = obj.nextInt();
        }
        for (int i = 0; i<n; i++){
            System.out.println(a[i]);
        }
        /*System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);*/

    }
}
