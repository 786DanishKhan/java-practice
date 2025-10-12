package LeetCode;

public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        Solution13 fo = new Solution13();
        int index = fo.strStr(haystack, needle);
        System.out.println(index);
    }
}
 class Solution13 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
