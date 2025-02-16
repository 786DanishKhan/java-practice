package practice;

import java.util.Scanner;

public class StringLowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        // sum of the lengths of A and B
        int totallength = A.length() + B.length();
        System.out.println(totallength);

        //Lexicographical comparison of A and B
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //Capitalized the first letter of both string
        String capitalizedA= A.substring(0,2).toUpperCase() + A.substring(1);
        String capitalizedB= B.substring(0,2).toUpperCase() + B.substring(1);

        System.out.println(capitalizedA+ " " +capitalizedB);
    }
}
