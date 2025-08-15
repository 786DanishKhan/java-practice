package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(26);
        person.setName("danish");
        person.setRollNumber(123);

        System.out.println("Name:" +person.getName());
        System.out.println("Azlge:" +person.getAge());
        System.out.println("rollNumber: " +person.getRollNumber()) ;
    }
}
