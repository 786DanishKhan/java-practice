package FinalChatGpt;

public class Person { //Encapsulation Example
    // Private fields (encapsulation)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {  // simple validation
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to test
    public static void main(String[] args) {
        Person p1 = new Person("John", 25);

        // Using getters
        System.out.println("Initial Name: " + p1.getName());
        System.out.println("Initial Age: " + p1.getAge());

        // Using setters
        p1.setName("Alice");
        p1.setAge(30);

        // Display updated info
        p1.displayInfo();
    }
}