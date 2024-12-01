public class SumOfDigits {
    public static void main(String[] args) {
        int number = 8269;
        int sum = 0;

        while (number!= 0) {
            int remainder = number % 10;
            number = number / 10;
            sum = sum + remainder;
        }

        System.out.println(sum);
    }
}
