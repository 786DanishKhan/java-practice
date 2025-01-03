package oops.encapsulation;

public class Person {
    private String name;
    private int age;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public int getRollNumber(){
        return this.rollNumber;
    }

}
