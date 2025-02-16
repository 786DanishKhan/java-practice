package hackerrank;

import java.util.Scanner;
//Done
public class JavaIfElse {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = obj.nextInt();

        if (n % 2 != 0) {
            System.out.println(" weird");
        }else if (n>=2 && n<=5) {
                System.out.println(" not weird");
            }else if (n>=6 && n<=20) {
                System.out.println(" weird");
            } else if (n > 20){
                System.out.println(" not weird");
            }
        }
    }

