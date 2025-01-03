package geeksforgeeks;

public class PeakElement1 {
    static int peakElement(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean left = true;
            boolean right = left;

            //check the element to tha left
            if (i > 0 && arr[i] <= arr[i - 1]) {
                left = false;
            }
            //check the element to the right
            if (i < n - 1 && arr[i] <= arr[i + 1]) {
                right = false;
            }
            if (left && right) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        int peakElement = peakElement(arr);
        System.out.println(peakElement);
    }
}