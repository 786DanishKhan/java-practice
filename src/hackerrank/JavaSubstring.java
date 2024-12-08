package hackerrank;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

       // String input = "Helloworld";
        String s;
        int start = scan.nextInt();
        int end = scan.nextInt();

        s = input.substring(start, end);
        System.out.println(input);
        System.out.println(s);
    }
}
