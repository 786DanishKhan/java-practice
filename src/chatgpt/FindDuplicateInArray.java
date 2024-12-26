package chatgpt;
import java.util.HashMap;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 5, 6, 5};
        int n = arr.length;
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if( numbers.containsKey(arr[i])){
            numbers.put(arr[i], numbers.get(arr[i])+1);
        }else{
                numbers.put(arr[i],1);
            }
            }
        System.out.println("Duplicate in the array:");
        for (int key : numbers.keySet()){
            System.out.println(key+ " " +numbers.get(key));
        }
    }
}
