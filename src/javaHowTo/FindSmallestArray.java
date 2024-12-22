package javaHowTo;

public class FindSmallestArray {
    public static void main(String[] args) {
        int[] arr = {20, 22, 18, 35, 48, 26, 87, 78};
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element in array " + smallest );
    }
}
