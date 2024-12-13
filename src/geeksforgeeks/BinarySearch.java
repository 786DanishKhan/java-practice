package geeksforgeeks;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int target = 4;
        int targetindex = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int midIndex = left + (right - left) / 2;

            if (arr[midIndex] == target) {
                targetindex = midIndex;
                break;
            } else if (target < arr[midIndex]) {
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }
        if (targetindex == -1){
            System.out.println("Element not found in array;");
        }else{
            System.out.println("Element found at index:" +targetindex );
        }
    }
}