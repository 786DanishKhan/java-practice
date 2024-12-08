package hackerrank;

import java.util.Scanner;

public class JavaStringToken {
    public static void main(String[] args) {
        //String sentence = "He is a very very good boy isn' t he"; //initialize input
        Scanner sc = new Scanner(System.in); // user input
        String sentence= sc.nextLine();
        String[] words = sentence.split(" ");
        //String words count
        int countWords = words.length;

        System.out.println(countWords);
        //
        for (int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }
        System.out.println();
        // Reverse string token
        for (int i = words.length-1; i>=0; i--){
            System.out.print(words[i]+ " ");
    }
    }
}
