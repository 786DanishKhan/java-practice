public class ArrayPrint {
    //Done
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 99, 100};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr[arr.length - 2]);
    }
}

