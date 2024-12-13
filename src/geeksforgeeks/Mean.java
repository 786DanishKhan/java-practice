package geeksforgeeks;

public class Mean {
    public static void main(String[] args) {
        int [] A = {56, 67, 30, 79};
        int N = 4;
        int sum = 0;
        for (int i = 0; i<N; i++) {
            sum = sum + A[i];
        }
            System.out.println(sum/N);
    }
}
