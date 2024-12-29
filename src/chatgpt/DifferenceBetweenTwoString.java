package chatgpt;

import java.util.HashMap;

public class DifferenceBetweenTwoString {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char extraChar = findExtraChar(s,t);
        System.out.println("The extra character is:" + extraChar);
    }
    public static char findExtraChar(String s, String t) {
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
            if (!countChar.containsKey(ch)||countChar.get(ch)==0) {
                return ch;
            }
                countChar.put(ch,countChar.get(ch)-1);
            }
        return 0;
    }
}
