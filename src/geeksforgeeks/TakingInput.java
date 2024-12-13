package geeksforgeeks;

import java.util.Scanner;

public class TakingInput {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        float b = obj.nextFloat();
        long c = obj.nextLong();
        byte d = obj.nextByte();
        obj.nextLine();
        String s = obj.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);

    }
}