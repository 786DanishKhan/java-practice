package practice;

public class Student {
    String name;  // create a class attribute
    int age; // create a class attribute

    //Default constructor
    Student() {
        name = "Danish"; // set the initial value of class student name
        age = 26; // set the initial value of class student age
    }

    //Main method call the call constructor class
    public static void main(String[] args) {
        Student D = new Student();
        System.out.println(D.age);
        System.out.println(D.name);
    }
        }
