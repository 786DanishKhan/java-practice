package w3schools;
import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap <Integer, String> people =new HashMap<>();

        people.put(32,"John");
        people.put(34,"Jane");
        people.put(36,"Jony");

        for (Integer key : people.keySet()) {
            System.out.println("Age:" +key + " Name:" +people.get(key));
        }

        System.out.println(people.remove(32));
        System.out.println(people.containsKey(32));
        System.out.println(people.containsKey(34));
        System.out.println(people.size());
    }
}
