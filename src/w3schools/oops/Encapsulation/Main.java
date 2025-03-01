package w3schools.oops.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person1 obj = new Person1();
        obj.setName("Danish");
        obj.setAge(25);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
