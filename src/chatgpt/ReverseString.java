package chatgpt;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split("");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
        }
        System.out.println(reversed);
    }
}
