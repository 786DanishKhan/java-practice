package FinalChatGpt;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String a = "swiss";
        HashMap<Character,Integer> charCount = new HashMap<>();
        for (int i = 0; i< a.length(); i++){
            char ch = a.charAt(i);
            if(charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch)+1);
            } else {
                charCount.put(ch,1);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (charCount.get(ch) == 1) {
                System.out.println("The first non-repeating character is: " + ch);
                break;
            }
        }
    }
}
