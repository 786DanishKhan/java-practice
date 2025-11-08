package LeetCode;

public class ReverseString1 {
    public static void main(String[] args) {
        String s = "hello";
        Solution508 RS = new Solution508();
        char[] charArray = s.toCharArray();
        RS.reverseString(charArray);
        System.out.println(charArray);
    }
}
class Solution508{
    public void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
