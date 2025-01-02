package chatgpt;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 3, 4, 1, 5};
         ArrayList<Integer> duplicates  = new ArrayList<>();
        HashMap<Integer,Integer> numbersCount = new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            if (numbersCount.containsKey(arr[i])){
                numbersCount.put(arr[i], numbersCount.get(arr[i])+1);
            }else  {
                numbersCount.put(arr[i], 1);
            }
        }
        System.out.println(numbersCount);
        for (int i : numbersCount.keySet()){
            if(numbersCount.get(i)>1) {
                duplicates.add(i);
                //System.out.println(i);
            }
        }
        System.out.println(duplicates);
    }
}
