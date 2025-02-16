public class PrintReversArray {
    //Done
    public static void main(String[] args) {
        int[] numbers= {1, 2, 3, 4, 5, 11, 12};

        for (int i = numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]+ " ");
        }
    }
}
