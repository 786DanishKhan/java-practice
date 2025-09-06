package FinalChatGpt;

import java.util.Arrays;

public class AnagramWithoutHashmap {
    public static void main(String[] args) {
        String a = "okok";
        String b = "silent";
        boolean result = areAnagrams(a, b);
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }

    public static boolean areAnagrams(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);



        return Arrays.equals(charArrayA, charArrayB);
    }
}
