package LeetCode;

import java.util.HashMap;

public class FirstUniqueCharacterIndex {
    public static void main(String[] args) {
        String s = "loveleetcode";
        Solution39 solution = new Solution39();
        int index = solution.firstUniqChar(s);
        System.out.println(index);
    }
}
class Solution39{
    public int firstUniqChar(String s){
        HashMap<Character,Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
    }
        for (int i = 0; i < s.length(); i++){
            if (countMap.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
