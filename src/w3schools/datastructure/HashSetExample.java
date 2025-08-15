package w3schools.datastructure;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<>();
        // Add values to the set
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i<=10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " was found in the set.");
            }else{
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
