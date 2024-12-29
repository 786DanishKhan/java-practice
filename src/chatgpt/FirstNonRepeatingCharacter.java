package chatgpt;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char letter;
        HashMap<Character, Integer> uniqueLetter = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            if (uniqueLetter.containsKey(letter)) {
                uniqueLetter.put(letter, uniqueLetter.get(letter)+1);
            } else {
                uniqueLetter.put(letter, 1);
            }
        }
        System.out.println("First non repeating character");
        for (char ch : uniqueLetter.keySet()) {
            if (uniqueLetter.get(ch) == 1) {
                System.out.println(ch);
                System.out.println(input.indexOf(ch));
            }
        }
    }
}