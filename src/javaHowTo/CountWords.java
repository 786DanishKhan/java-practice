package javaHowTo;

public class CountWords {
    public static void main(String[] args) {
        String words = "One two three four five six";
        
        int countWords = words.split(" ").length;
        System.out.println(countWords);
    }
}
