package w3schools.oops;

public class Person {
    String firstname = "John";
    String lastname = "Vick";
    int age = 50;

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println("firstname:" +myObj.firstname+ " lastname:" +myObj.lastname);
        System.out.println("Age: " +myObj.age );
    }
}
