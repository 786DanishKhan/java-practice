package w3schools.oops.Abstraction;
// Definition = Data abstraction is the process of hiding certain details
// and showing only essential information to the user.
public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

abstract class Animal{

    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says:wee wee");
    }
}

