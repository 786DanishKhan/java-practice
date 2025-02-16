public class BubbleSort {
    //Already done
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] numbers = {7, 12, 9, 11, 3};
        //bubble sort
        for (int i = 0; i < numbers.length - 1; i++) {  // I IS COUNTER
            for (int j = 0; j < numbers.length - i - 1; j++) {  //ACTUAL ARRAY KE UNDER INDEX J SE DEFINE HOGA
                if (numbers[j] > numbers[j + 1]){ //
                // swap
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
            }
        }
    }
        printArray(numbers);

    }
    }
