package javatpoint;
//Done
// a palindrome is a sequence of characters that reads the same backward as forward.
// ex- radar,level,madam,12321.
public class PalindromeNumber {
    public static void main(String[] args)  {
        int n = 454;
        int reverse = 0;
        int original = n;

        while (n > 0){
            int remainder = n%10;
            reverse = reverse*10 + remainder;
            n = n/10;
        }

        if (original==reverse){
            System.out.println(original+ " is Palindrome");
        }else{
            System.out.println(original+ " is not Palindrome");
        }
    }
}
