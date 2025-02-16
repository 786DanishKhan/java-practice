package javaHowTo;
//Done
public class ReverseString {
    public static void main(String[] args) {
        String A = "Hello";
        String B = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            B = B + A.charAt(i);
        }
        System.out.println(B);
    }
}
