package FinalChatGpt;

public class CaseConversion {
    public static void main(String[] args) {
        String input = "Java Programming";
        for (char c : input.toCharArray()){
            if (Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)){
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(c);
            }
        }
}
}