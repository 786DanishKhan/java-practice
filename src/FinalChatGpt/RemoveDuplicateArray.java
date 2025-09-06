package FinalChatGpt;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 2, 4, 3, 5, 1};
        int n = arr.length;
        ArrayList<Integer> duplicate = new ArrayList<>();
        HashMap<Integer,Integer> numbersCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (numbersCount.containsKey(arr[i])) {
                numbersCount.put(arr[i], numbersCount.get(arr[i]) + 1);
            } else {
                numbersCount.put(arr[i], 1);
            }
        }
        System.out.println("Duplicate in the array:");
        for (int i : numbersCount.keySet()) {
            if (numbersCount.get(i) > 1) {
                duplicate.add(i);
            }
        }
        System.out.print(duplicate);
    }
}
