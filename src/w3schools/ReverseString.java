package w3schools;

public class ReverseString {
    public static void main(String[] args) {

        String input = "Danish Khan";
        String result = "";

        for (int i = input.length()-1; i>=0; i-- ){

            result = result + input.charAt(i);
        }

        System.out.println(result);
    }

}
