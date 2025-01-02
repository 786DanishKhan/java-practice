package geeksforgeeks;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 6, 5, 3, 7, 1};
        int n = 8;
        int sum = n * (n+1)/2;
        int result = 0;

        for(int i = 0; i<n-1;i++){
            result = result + arr[i];
        }

        int missingNumber = sum - result;
        System.out.println(missingNumber);

    }
}
