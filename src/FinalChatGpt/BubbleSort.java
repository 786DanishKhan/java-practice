package FinalChatGpt;
//Bubble sort is a comparison based sorting algorithm used to arrange element in an array in a specific order(Ascending ans Descending).
// It works by repeatedly throgh stepping the  list, comparing adjacent element, if they are in the wrong order.
// The process continues until no more swap are needed, indicating that the list is sorted.
public class BubbleSort {
    public static void printArray(int[] numbers){
       for(int i = 0; i < numbers.length; i++){
           System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {7,12,9,11,3};
        int n = numbers.length;
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
