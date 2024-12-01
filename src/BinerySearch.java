class BinarySearch {
    public static void main(String[] args) {
        // Sorted array
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int target = 23;

        // Call binary search function
        int result = binarySearch(numbers, target);

        // Print the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Iterative binary search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller than mid, search in the left half
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                // If target is larger, search in the right half
                left = mid + 1;
            }
        }

        // Target not found
        return -1;
    }
}


