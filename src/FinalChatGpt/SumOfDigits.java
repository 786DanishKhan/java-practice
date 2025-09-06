package FinalChatGpt;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        int number = 12345;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
