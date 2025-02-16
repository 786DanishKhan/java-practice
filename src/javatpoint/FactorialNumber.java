package javatpoint;
// A factorial number refer to the factorial of a non-negative integer n, denoted as n!
// It represents the product of all positive integers from 1 to n.
//Done
public class FactorialNumber {
    public static void main(String[] args) {
        int factorial = 1;
        int number=5;

        for (int i = number; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " +number+ " is:" +factorial);
    }
}
