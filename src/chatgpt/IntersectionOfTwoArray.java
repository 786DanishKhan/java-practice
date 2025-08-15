package chatgpt;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};
        HashMap<Integer, Integer> numbersCount = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (numbersCount.containsKey(arr1[i])) {
                numbersCount.put(arr1[i], numbersCount.get((arr1[i]) + 1));
            } else {
                numbersCount.put(arr1[i], 1);
            }
            System.out.println(numbersCount);
        }
        ArrayList<Integer> intersection = new ArrayList();
        for (int i = 0; i<arr2.length; i++){
            if (numbersCount.containsKey(arr2[i])){
                if (!intersection.contains(arr2[i])){
                    intersection.add(arr2[i]);
                }
            }
        }
        System.out.println(intersection);
    }
}
