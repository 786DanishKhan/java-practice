package practice;

public class Student1 {
    String name;
    int age;

    Student1 (String name, int age){ // parameterized constructor
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " +name+ " age:" +age);
    }

    public static void main(String[] args) {
        Student1 s = new Student1("Danish",26);
        s.display();
    }
}
