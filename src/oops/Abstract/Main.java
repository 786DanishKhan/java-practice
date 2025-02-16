package oops.Abstract;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape = new Rectangle();
        shape.draw();
    }
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
