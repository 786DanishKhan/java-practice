package javaHowTo;

import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        for (int i = 0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
