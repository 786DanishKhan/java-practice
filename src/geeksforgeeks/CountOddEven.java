package geeksforgeeks;

public class CountOddEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9, 11};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] count = {odd, even};
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
        System.out.println(count);
    }
}
