package chatgpt;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char letter;
        HashMap<Character, Integer> uniqueLetter = new HashMap<>();
        for (int i = 0; i<input.length(); i++){
             letter = input.charAt(i);
            if (uniqueLetter.get(input.charAt(i)) != null) {
                uniqueLetter.put(input.charAt(i), uniqueLetter.get(input.charAt(i)) + 1);
            } else {
              uniqueLetter.put(input.charAt(i),1);
            }
        }
        for (int i = 0; i<input.length(); i++){
            if (uniqueLetter.get(input.charAt(i)) == 1){
                System.out.println(input.charAt(i));
                break;
            }else if (i == input.length()-1){
                System.out.println();
            }
        }
    }
    }