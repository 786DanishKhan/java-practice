package LeetCode;

import java.util.HashMap;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        Solution389 FTD = new Solution389();
        char result = FTD.findTheDifference(s, t);
        System.out.println(result);
    }
}
class Solution389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> countChar = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (countChar.containsKey(ch)) {
                countChar.put(ch, countChar.get(ch) + 1);
            } else {
                countChar.put(ch, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!countChar.containsKey(ch) || countChar.get(ch) == 0) {
                return ch;
            } else {
                countChar.put(ch, countChar.get(ch) - 1);
            }
        }
        return 0;
    }
}