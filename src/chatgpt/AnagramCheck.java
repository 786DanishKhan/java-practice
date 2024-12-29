package chatgpt;

import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        boolean result = areAnagrams(a, b);
        System.out.println(result);
    }

    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }
        for (int i = 0; i<b.length(); i++){
            char ch = b.charAt(i);
            if (charCount.containsKey(ch)){
                charCount.put(ch, charCount.get(ch)-1);
                if (charCount.get(ch)==0){
                    charCount.remove(ch);
                }
            }
        }
        return charCount.isEmpty();
    }
}