package practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;
        int targetIndex = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int midIndex = left + (right - left) / 2;

            if (arr[midIndex] == target) {
                targetIndex = midIndex;
                break;
            } else if (target < arr[midIndex]) {
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }
        if (targetIndex == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index:" + targetIndex);
        }
    }
}