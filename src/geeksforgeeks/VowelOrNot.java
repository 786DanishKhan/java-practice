package geeksforgeeks;
public class VowelOrNot {
    public static void main(String[] args) {
        char c = 'i';
        isVowel(c);
    }
    public static void isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println(c+ " is Vowel");
        } else {
            System.out.println(c+ " is not Vowel");
        }
    }
}
