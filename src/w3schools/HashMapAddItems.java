package w3schools;
import java.util.HashMap;
public class HashMapAddItems {
    public static void main(String[] args) {
        HashMap<String,String> capitalCities =new HashMap<>();
        capitalCities.put("England","London");
        capitalCities.put("Norway","oslo");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("Germany","Berlin");
        //System.out.println(capitalCities.get("India"));
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        //capitalCities.clear();
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        capitalCities.keySet();
       // System.out.println(capitalCities.keySet());
        for(String key :capitalCities.keySet()){
            System.out.println(capitalCities.get(key));
        }
    }
}
