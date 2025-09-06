package FinalChatGpt;

import java.util.HashMap;

public class DuplicateFinder {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 7, 8, 8, 2, 1};
        int n = arr.length;
        System.out.println("Duplicate elements in the array:");
        HashMap<Integer, Integer> Duplicate = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (Duplicate.containsKey(arr[i])) {
                Duplicate.put(arr[i], Duplicate.get(arr[i]) + 1);
            } else {
                Duplicate.put(arr[i], 1);
            }
        }
        for (int i : Duplicate.keySet()) {
            if (Duplicate.get(i) > 1) {
                System.out.print(i + " ");
            }
        }
        }
}
