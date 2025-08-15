package w3schools.datastructure;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        System.out.println(capitalCities);
        Set<String> keys = capitalCities.keySet();
        System.out.println(keys);
        Collection<String> values = capitalCities.values();
        System.out.println(values);
        for (String key : capitalCities.keySet()){
            System.out.println(key);
        }
        for (String value : values){
            System.out.println(value);
        }
    }
}
