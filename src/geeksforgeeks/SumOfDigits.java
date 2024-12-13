package geeksforgeeks;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12;

        int sum = 0;

        while (n > 0) {

            int mod = n % 10;
            sum = sum + mod;
             n = n / 10;
        }
        System.out.println(sum);
    }
}
