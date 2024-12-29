package w3schools;
import java.util.HashSet;
public class HashSetAddItems {
    public static void main(String[] args) {
        HashSet <String> cars = new HashSet <String>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Honda");

        System.out.println(cars);

        System.out.println(cars.contains("Audi"));

        //cars.remove("Audi");
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);

        cars.size();
        System.out.println(cars.size());
    }

}
