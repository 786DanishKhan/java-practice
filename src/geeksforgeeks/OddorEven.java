package geeksforgeeks;
//Done
import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();//user input
        //int n = 11; hardcode value
        String s= oddEven(n);
        System.out.println(s);
    }
    static String oddEven(int n) {
        // code here
        if (n%2 == 0){
            return "even";
        }else {
            return "odd";
        }
    }
}

