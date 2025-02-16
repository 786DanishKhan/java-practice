package javaHowTo;
//Done
public class CountWords {
    public static void main(String[] args) {
        String sentence = "One two three four five six";
        String[] words = sentence.split(" ");

        int countWords = words.length;
        System.out.println(countWords);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}