package FinalChatGpt;

public class SecondLargestFinder {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : number) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("The second largest number is: " + secondLargest);
    }
}
