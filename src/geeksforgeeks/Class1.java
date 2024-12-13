package geeksforgeeks;

import java.util.Scanner;

class Class1 {
    void add(int p, int q) {
        System.out.println(p + q);
    }
}

class Class2 extends Class1 {
    void mul(int p, int q) {
        System.out.println(p * q);

    }

    void task(int p, int q) {
        System.out.println(p * p + q * q);
    }
}

class test {
    public static void main(String[] args) {
        Class2 obj = new Class2();
        int a = 4;
        int b = 5;
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
    }
}
