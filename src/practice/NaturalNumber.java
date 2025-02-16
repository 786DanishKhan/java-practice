package practice;

//Naturals number are the numbers we use to count things.
//They statrt with 1 and go on to 2,3,4 so on.
//Natural number are also called positive integer.
public class NaturalNumber {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural number : " + sum);
    }
}
