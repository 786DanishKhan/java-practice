package FinalChatGpt;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr, int n){
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int n = 10; // The range is from 1 to 10
        System.out.println("The missing number is: " + findMissingNumber(arr, n));
    }
}
