package geeksforgeeks;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i+ "  ");
                System.out.print(" True");
            }
        }
    }
}
