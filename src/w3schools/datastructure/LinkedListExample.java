package w3schools.datastructure;

import w3schools.oops.Car;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        System.out.println(cars);
        System.out.println(cars.get(2));
        System.out.println(cars.set(2,"Mazda"));
    }
}
