package geeksforgeeks;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = new String("GFG");
        String str2 = new String("GFG");
        System.out.println(str1==str2); //2 different objects
        System.out.println(str1.equals(str2));

        String s1= "GFG1";
        String s2= "GFG1";
        System.out.println(s1==s2); // Same object
        System.out.println(s1.equals(s2));
    }
}
