package geeksforgeeks;
//Done
public class PalindromicArray {
    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        boolean result = palinArray(arr);
        System.out.println(result);
    }

    public static boolean palinArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean abc = isPalindrome(arr[i]);
            if (!abc) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int remainder = 0;
        int reverse = 0;
        int n = num;

        while (n > 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        if (num == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
