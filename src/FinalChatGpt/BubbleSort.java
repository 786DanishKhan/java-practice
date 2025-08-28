package FinalChatGpt;

public class BubbleSort {
    public static void printArray(int[] numbers){
        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {7,12,9,11,3};
    for (int i = 0; i < numbers.length - 1; i++) { // Outer loop
            for (int j = 0; j < numbers.length - i - 1; j++) { // Inner loop
                if (numbers[j] > numbers[j + 1]) { // Compare adjacent elements
                    // Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        printArray(numbers); // Print the sorted array
    }
}
