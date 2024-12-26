package chatgpt;

import java.util.HashMap;

public class ArrayToHashMap {
    public static void main(String[] args) {
        int[] arr = {17, 28, 28, 45, 38, 28};
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (numbers.containsKey(arr[i])) {
                numbers.put(arr[i], numbers.get(arr[i]) + 1);
            } else {
                numbers.put(arr[i], 1);
            }
        }
        System.out.println(numbers);
    }
}
