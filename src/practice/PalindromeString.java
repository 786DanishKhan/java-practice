package practice;
//Done
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String A = sc.nextLine();
        String B = "";

        for (int i = A.length()-1; i>=0; i--){
            B+=A.charAt(i);
        }
        if(A.compareTo(B)==0){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
