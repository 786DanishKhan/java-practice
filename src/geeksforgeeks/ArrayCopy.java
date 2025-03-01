package geeksforgeeks;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int [] originalArray = {1, 2, 3, 5, 0,9};
        int [] copyArray = new int[originalArray.length];
        for (int i = 0; i<originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(copyArray));

    }
}
