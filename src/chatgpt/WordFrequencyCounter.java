package chatgpt;

import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String input = "this is a test this is only a test";
        HashMap<String, Integer> wordsCount = new HashMap<>();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (wordsCount.containsKey(words[i])) {
                wordsCount.put(words[i], wordsCount.get(words[i]) + 1);
            } else {
                wordsCount.put(words[i], 1);
            }
        }
        System.out.println(wordsCount);
    }
}
