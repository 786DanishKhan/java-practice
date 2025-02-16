package practice;

import java.util.Arrays;
//Already done

public class CheckEqualArray {
    public static void main(String[] args) {
        int  [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 2, 3, 4, 5};
        if (a.length != b.length) {
            System.out.println("false");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                System.out.println("false");
            }else{
                System.out.println("true");
            }
        }
    }
}
