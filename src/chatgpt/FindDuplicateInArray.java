package chatgpt;

import java.util.HashMap;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 5, 6, 5};
        HashMap<Integer, Integer> numbersCount = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (numbersCount.containsKey(arr[i])) {
                numbersCount.put(arr[i], numbersCount.get(arr[i]) + 1);
            } else {
                numbersCount.put(arr[i], 1);
            }
        }
        System.out.println("Duplicate in the array:");
            for (int i : numbersCount.keySet()) {
            if (numbersCount.get(i) > 1) {
                System.out.print(i+ " ");
            }
        }
    }
}