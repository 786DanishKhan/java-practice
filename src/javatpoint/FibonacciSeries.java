package javatpoint;
//Done
//The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int first = 0 , second = 1;
        System.out.println("Fibonacci serier up to:" +n);

        for (int i = 0; i<=n; i++){
            System.out.println(first+ " ");

            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}
