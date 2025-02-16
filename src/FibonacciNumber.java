import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        //Scanner obj = new Scanner(System.in);
        //int n = obj.nextInt();
        int n = 10;
        int x = 0, y = 1, z = 0;
        for (int i = 0; i <= n; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println(z);
    }
}
