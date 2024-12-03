package w3schools;

public class FindArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {20, 22, 18, 35, 48, 26, 87, 70};

        int sum = 0, avg = 0;

        for(int i = 0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("sum;" +sum);

        avg = sum/numbers.length;
        System.out.println("Avg;" +avg);
        }
    }
