package w3schools;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
       HashMap <Integer,String> num1 =new HashMap<>();
       HashMap <Integer,String> num2 =new HashMap<Integer,String>();

       num1.put(1, "one");
       num1.put(2, "two");
       num1.put(3, "three");

       num2.put(4, "four");
       num2.put(5, "five");
       num2.put(6, "six");

        System.out.println("Mapping of Hashmap num1 are:" +num1);

        num1.put(2,"For");
        System.out.println("Mapping of Hashmap num2 are:" +num1);
        System.out.println("Mapping of Hashmap num2 are:" +num2);
    }
}
