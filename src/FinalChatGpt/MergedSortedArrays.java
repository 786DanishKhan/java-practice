package FinalChatGpt;

import java.util.Arrays;

public class MergedSortedArrays{
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 6, 7};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
}

