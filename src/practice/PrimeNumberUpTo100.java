package practice;

public class PrimeNumberUpTo100 {
    public static void main(String[] args) {
        boolean isPrime;
        for (int i = 2; i < 100; i++) {
            isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // No need to check further if we found a divisor
                }
            }
            if (isPrime) {
                System.out.println(i + " is a prime number.");
        }

        }
    }


}
