package w3schools;

public class WordsCount {
    public static void main(String[] args) {

        String sentence = "My Name is Danish Khan";
        String[] words = sentence.split(" ");

        for (int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }
        int countWords = words.length;

        System.out.println(countWords+ " words");
    }
}
