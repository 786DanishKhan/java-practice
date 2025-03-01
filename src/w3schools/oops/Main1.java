package w3schools.oops;

import w3schools.oops.Encapsulation.Person1;

public class Main1 {
    int x = 5;

    public static void main(String[] args) {
        Main1 obj1 = new Main1();
        Main1 obj2 = new Main1();
        obj2.x = 25;
        System.out.println(obj1.x);
        System.out.println(obj2.x);


    }
}
