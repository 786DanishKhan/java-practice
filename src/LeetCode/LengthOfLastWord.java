package LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        Solution8 solution = new Solution8();
        int length = solution.lengthOfLastWord(s);
        System.out.println(length);
    }
}
class Solution8 {
    public int lengthOfLastWord(String s) {
        System.out.println(s);
        s = s.trim();
        System.out.println(s);
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
