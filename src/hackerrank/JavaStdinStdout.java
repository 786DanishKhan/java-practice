package hackerrank;

import java.util.Scanner;

public class JavaStdinStdout {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int num = scan.nextInt();
            double salary =scan.nextDouble();
            scan.nextLine();
            String name = scan.nextLine();


            // Write your code here.

            System.out.println("String: " + name);
            System.out.println("Double: " + salary);
            System.out.println("Int: " + num);
        }
    }

