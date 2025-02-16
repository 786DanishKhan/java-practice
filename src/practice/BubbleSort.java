package practice;

public class BubbleSort {
    //Already done final

    public static void  printArray(int arr[]){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7, 12, 9, 11, 3};

        for (int i = 0; i< arr.length-1; i++){// outer loop
            for (int j = 0; j< arr.length-i-1; j++){// inner loop

                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
