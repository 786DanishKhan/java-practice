package w3schools.datastructure;

import w3schools.oops.Car;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("FORD");
        cars.add("FIAT");
        Collections.sort(cars);
        System.out.println(cars);
        cars.add(1,"Audi");
        cars.get(2);
        System.out.println(cars);


    }
}
