package geeksforgeeks;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i == 0 && arr[i] > arr[i + 1]) {
                System.out.println("true");
            }
            else if (i == n - 1 && arr[i] > arr[i - 1]) {
                System.out.println("true");
            }
            else if (i > 0 && i < n - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
