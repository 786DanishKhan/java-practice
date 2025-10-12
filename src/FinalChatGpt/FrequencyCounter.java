package FinalChatGpt;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        String sentence = "Java is a programming language. Java is widely used.";

        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.split("");
        for (int i = 0; i < words.length; i++) {
            if (wordCount.containsKey(words[i])) {
                wordCount.put(words[i], wordCount.get(words[i]) + 1);
            } else {
                wordCount.put(words[i], 1);
            }
        }
        System.out.println("Frequency of words:" +wordCount);
    }
}
