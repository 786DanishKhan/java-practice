package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FisrtUniqueCharacterString {
    public static void main(String[] args) {
        String s = "leetcode";
        Solution24 solution = new Solution24();
        int index = solution.firstUniqueChar(s);
        System.out.println(index);
    }
}
class Solution24 {
    public int firstUniqueChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }return -1;
    }
}