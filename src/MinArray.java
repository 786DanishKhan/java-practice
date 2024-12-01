public class MinArray {
    public static void main(String[] args) {
        int[] numbers = {58, 35, 46, 79, 30};
        int min = numbers[0];


        for (int i =1; i<numbers.length; i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Smallest Element:" +min);
    }
}
