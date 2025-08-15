package interviewbit;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3 = "abc";
        System.out.println(str1==str3);//Compare Address
        System.out.println(str1.equals(str3));//Compare value
        String str4 = new String("abc");
        System.out.println(str1==str4);
        System.out.println(str1.equals(str4));
    }
}
