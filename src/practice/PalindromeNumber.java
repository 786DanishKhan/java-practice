package practice;
//Already done
public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 123;
        int reverse = 0;
        int original = n;

        while (n>0){
            int remainder = n%10;
            reverse = reverse*10 + remainder;
            n = n/10;
        }
        if(original==reverse){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
