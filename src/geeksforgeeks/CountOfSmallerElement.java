package geeksforgeeks;

public class CountOfSmallerElement {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 5, 8, 9};
        int x = 9;
        int count = 0;

        for (int i = 0; i< arr.length; i++){
            if (arr[i]<=x){
                count++;
            }
        }
        System.out.println(count);
    }
}
