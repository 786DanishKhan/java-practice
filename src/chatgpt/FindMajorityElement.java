package chatgpt;

import java.util.HashMap;

public class FindMajorityElement {
    public static void main(String[] args) {
        int [] arr = {3, 3, 4, 2, 3, 3, 5, 6, 7,10};
        int requiredFrequency = arr.length/2;
        HashMap<Integer,Integer> numberCount = new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            if (numberCount.containsKey(arr[i])){
                numberCount.put(arr[i],numberCount.get(arr[i])+1);
            }else{
                numberCount.put(arr[i],1);
            }
        }
        System.out.println(numberCount);

        for (int i : numberCount.keySet()){
            if (numberCount.get(i)>requiredFrequency){
                System.out.println(i);
            }
        }
    }
}
