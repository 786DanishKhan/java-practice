package geeksforgeeks;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 1000, 167};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            } else if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        }
    }