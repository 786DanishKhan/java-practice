package FinalChatGpt;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.println("first " + n + " terms of Fibonacci series:");

        for (int i = 0; i <= n; i++) {
            System.out.println(a + " ");
            int c = a + b;
                 a=b;
                 b=c;
        }
    }
}
