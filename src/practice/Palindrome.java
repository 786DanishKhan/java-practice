package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";

        for(int i = a.length()-1; i>=0; i--) {
            b = b + a.charAt(i);
        }
            if(a.compareTo(b) == 0){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a palindrome");
            }
        }
    }
