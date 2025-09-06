package FinalChatGpt;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElementFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {4, 5, 6, 7, 8};

        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (elementCount.containsKey(arr[i])) {
                elementCount.put(arr[i], elementCount.get(arr[i]) + 1);
            } else {
                elementCount.put(arr[i], 1);
            }
        }

        ArrayList<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (elementCount.containsKey(arr1[i]) && elementCount.get(arr1[i]) > 0) {
                commonElements.add(arr1[i]);
            }
        }
        System.out.println("Common elements are: " + commonElements);
    }
}