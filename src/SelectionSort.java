public class SelectionSort {
    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {7, 12, 9, 11, 3};

        for (int i = 0; i< numbers.length-1; i++){ // outer loop
            int smallest = i;
            for(int j = i+1; j< numbers.length; j++){
                if (numbers[smallest]>numbers[j]){
                    smallest = j;
                }
            }

            //swap
            int temp = numbers[smallest];
            numbers[smallest] = numbers[i];
            numbers[i] = temp;
        }
        printArray(numbers);
    }
}
