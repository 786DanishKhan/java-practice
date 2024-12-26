package chatgpt;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int [] arr = {17, 28, 34, 45, 28};
        ArrayList<Integer> numbers = new  ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            numbers.add(arr[i]+1);
        }
        System.out.println(numbers);
        }
    }

