package w3schools;
//Already Done
public class MinArray {
        public static void main(String[] args) {
            int[] numbers = {20, 22, 18, 35, 48, 26, 87, 70};
            int min = numbers[0];


            for (int i =1; i<numbers.length; i++){
                if(numbers[i]<min){
                    min=numbers[i];
                }
            }
            System.out.println("Smallest Element:" +min);
        }
    }