package practice;

public class CountWordsInBackwordForward {
    public static void main(String[] args) {
        String sentence = "He is a very very good boy isn, t he";
        String[] words = sentence.split(" ");

        int countWords = words.length;

        System.out.println(countWords);

        //forward print
        for (int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }
        System.out.println();

        //backward print
        for (int i = words.length-1; i>+0; i--){
            System.out.println(words[i]);
        }
    }
}
