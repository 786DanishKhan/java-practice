package practice;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        String s;

        int start = obj.nextInt();
        int end = obj.nextInt();

        s = input.substring(start,end);

        System.out.println(input);
        System.out.println(s);
    }
}
