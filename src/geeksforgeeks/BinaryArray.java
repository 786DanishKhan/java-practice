package geeksforgeeks;
//Done
public class BinaryArray {
    public static void printArray(int[] arr) {
     for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
    }
        System.out.println();
}
public static void main(String[] args) {
    int[] arr = {1, 0, 1, 1, 0};
    //bubble sort
    for (int i = 0; i < arr.length - 1; i++) {  // I IS COUNTER
        for (int j = 0; j < arr.length - i - 1; j++) {  //ACTUAL ARRAY KE UNDER INDEX J SE DEFINE HOGA
            if (arr[j] > arr[j + 1]){ //
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        printArray (arr);
    }
}
    }