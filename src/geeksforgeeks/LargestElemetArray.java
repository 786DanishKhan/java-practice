package geeksforgeeks;

public class LargestElemetArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 55, 90};
        int largest = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
