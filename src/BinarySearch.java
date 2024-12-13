public class BinarySearch {
    public static void main(String[] args) {
        // Sorted array
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};
        int target = 20 ;
        int targetIndex = -1;

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            // Find the middle index
            int midIndex = left + (right - left) / 2; // 0 + (10 - 0)/2 = 5

            // Check if the target is at midIndex
            if (numbers[midIndex] == target) {  //23 == 23
                targetIndex = midIndex;
                break;
            } else if (target < numbers[midIndex]) {
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }

        // Print the result
        if (targetIndex == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + targetIndex);
        }
    }
}



