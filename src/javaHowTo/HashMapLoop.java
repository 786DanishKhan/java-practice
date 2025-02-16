package javaHowTo;

import java.util.HashMap;

public class HashMapLoop {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities =new HashMap<>();
        capitalCities.put("England","London");
        capitalCities.put("Norway","oslo");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("Germany","Berlin");

        for (String key : capitalCities.keySet()) {
            //System.out.println(key);
            System.out.println(capitalCities.get(key));
        }
    }
}
