package chatgpt;

import java.util.HashSet;

public class ArrayToHashSet {
    public static void main(String[] args) {
        int [] arr = {17, 29, 35, 46, 29};
        HashSet <Integer> numbers = new HashSet<>();
        for (int i = 0; i< arr.length; i++){
            numbers.add(arr[i]);
        }
        System.out.println(numbers);
    }
}
