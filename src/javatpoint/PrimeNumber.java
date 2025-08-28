package javatpoint;
//Done
// Prime number is a number that is greater than 1 and divided by 1 or itself only.
public class PrimeNumber {
    public static void main(String[] args) {
        int n = 5;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is prime number");
        } 
    }
}
