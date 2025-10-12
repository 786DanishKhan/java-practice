package FinalChatGpt;

public class ReverseWordsOrder {
    public static void main(String[] args) {
        String str = "My name is danish";
        String[] words = str.split(" ");
        String reversedStr = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr += words[i] + " ";
        }
        System.out.println(reversedStr);
    }
}
