package geeksforgeeks;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int x = 3;
        linearSearch(arr,x);

    }
    static void linearSearch(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("number exists in array at index:" + i);
            }
        }
    }

}