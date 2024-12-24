package practice;

public class MinArray {
    public static void main(String[] args) {
        int[] number = {35, 40, 66, 55, 20, 19};
        int min = number[0];

        for (int i = 1; i<number.length; i++){
            if (number[i]<min){
                min = number[i];
            }
        }
        System.out.println("Smallest number: " +min);
    }
}
