package w3schools.Interface;

 class Main {
    public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.sleep();
    }
}

interface Animal{
    public void animalSound();
    public  void sleep();
}

class Pig implements Animal{
    // The body of animalSound() is provided here
    public void animalSound(){
        System.out.println("The pig says:wee wee");
    }

    @Override
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}