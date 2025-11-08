package LeetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        int reverse = 0;
        Solution1 pn = new Solution1();
        boolean isPalindrome = pn.isPalindrome(121);
        System.out.println(isPalindrome);


    }
}
class Solution1 {
    public boolean isPalindrome(int x) {
        if(x >= 0){
            return reverseNumber(x) == x;
        }else{
            return false;
        }
        //return x >= 0 ? reverseNumber(x) == x : false;
    }
    private int reverseNumber(int x) {
        int reverse = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;

        }
        return reverse;
    }
}
