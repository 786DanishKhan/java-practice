package LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        Solution34 solution = new Solution34();
        int reverse = solution.reverse(x);
        System.out.println(reverse);
    }
}
class Solution34{
    public int reverse(int x){
        int reverse = 0;
        while(x>0){
            int remainder = x %10;
            reverse = reverse *10 + remainder;
            x = x /10;

        }
        return reverse;
    }
}
