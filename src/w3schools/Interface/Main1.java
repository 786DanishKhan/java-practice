package w3schools.Interface;

public class Main1 {
    public static void main(String[] args) {
    Demo obj = new Demo();
    obj.myMethod();
    obj.myOtherMethod();
    }
}

interface FirstInterface{
    public void myMethod();
}

interface SecondInterface{
    public void myOtherMethod();
}

class Demo implements FirstInterface, SecondInterface{
public void myMethod(){
    System.out.println("Some text");
}

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text");
    }
}