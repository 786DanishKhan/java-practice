package practice;
//Final
public class CheckEqualArrayWithSort {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 2, 1};
        int[] b = {3, 4, 2, 1, 7};
        boolean isEqual = isEqual(a, b);
        System.out.println("Array is equal " +isEqual);

    }

    static boolean isEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - i-1; j++) {
                if (b[j] > b[j + 1]) {

                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
