package FinalChatGpt;

public class SubString {
    public static void main(String[] args) {
        String str = "My nams is danish";
        String sub = "danish";

        if(str.contains(sub)){
            System.out.println("The string contains the substring: " + sub);
        } else{
            System.out.println("The string does not contain the substring: " + sub);
        }
    }
}
