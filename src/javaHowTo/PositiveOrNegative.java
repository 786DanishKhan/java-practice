package javaHowTo;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0){
            System.out.println("The value is a positive number");
        }else if (number < 0){
            System.out.println("The value is a negative number");
        }else {
            System.out.println("The value is 0");
        }
    }
}