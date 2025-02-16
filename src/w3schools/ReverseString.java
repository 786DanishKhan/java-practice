package w3schools;

import java.sql.SQLOutput;
//Already done
public class ReverseString {
    public static void main(String[] args) {

        String input = "Danish Khan";
        String result = "";
        //System.out.println(input.length());
        System.out.println(input.charAt(0));

        for (int i = input.length()-1; i>=0; i-- ){

            result = result + input.charAt(i);
        }

        System.out.println(result);
    }

}
