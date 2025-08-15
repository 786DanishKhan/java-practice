package chatgpt;

import java.util.HashMap;

public class  CountCharacterFrequency {
    public static void main(String[] args) {
            String input = "java programming";
            //char letter;
            HashMap <Character,Integer> letterCount = new HashMap<>();
            for (int i = 0; i<input.length(); i++){
                 char letter = input.charAt(i);
                if (letterCount.containsKey(letter)){
                    letterCount.put(letter, letterCount.get(letter)+1);
                }else{
                    letterCount.put(letter,1);
                }
            }
            System.out.println(letterCount);
    }
}
