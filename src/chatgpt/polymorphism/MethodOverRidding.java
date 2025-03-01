package chatgpt.polymorphism;

import org.w3c.dom.ls.LSOutput;

public class MethodOverRidding {
    public static void main(String[] args) {
        Animal animal;
        animal = new Cat();
        animal.animalSound();
        animal = new Dog();
        animal.animalSound();
    }
}

class Animal{
    void animalSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void animalSound(){
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal{
    void animalSound(){
        System.out.println("Mew Mew");
    }
}
