package w3schools;

import org.w3c.dom.ls.LSOutput;

public class SumOfArray {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 1, 22, 25};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum is:" + sum);
    }
}