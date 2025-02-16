package practice;

public class FindMidElementInArray {
    public static void main(String[] args) {
        int [] arr = {2, 5, 4, 6, 8, 4, 5, 5};
        int [] arr1 = {5, 6, 8, 7, 5, 2, 3};
        System.out.println(findMid(arr));
        System.out.println(findMid(arr1));
    }
    private static int findMid(int[] arr) {
        int midIndex=arr.length/2;
        if(arr.length%2==0){
            return arr[midIndex-1];
        }
        return arr[midIndex];
    }
}


