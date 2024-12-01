public class FibonacciExample {
        public static void main(String[] args) {
            int n = 10;
            System.out.println("Fibonacci Series up to " + n + " terms:");

            int first = 0, second = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }

