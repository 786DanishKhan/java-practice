package oops.polymorphism.runtime;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal make a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meow");
    }
}