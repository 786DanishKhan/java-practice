package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        Solution383 RN = new Solution383();
        boolean construct = RN.ransomNote(ransomNote,magazine);
        System.out.println(construct);
    }
}
class Solution383{
    public boolean ransomNote(String ransomNote, String magazine){
Map<Character,Integer> map = new HashMap<>();
for(char c : magazine.toCharArray()){
    map.put(c,map.getOrDefault(c,0)+1);
}
for (char c : ransomNote.toCharArray()){
    if (!map.containsKey(c) || map.get(c)==0){
        return false;
    }
    map.put(c,map.get(c)-1);
}
return true;
    }
}
