package geeksforgeeks;
//Done
import java.util.Arrays;
//final
public class CheckEqualArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i =0; i<arr1.length; i++){
            if (arr1[i]!=arr2[i]){
                System.out.println(false);
            }else {
                System.out.println(true);
            }
        }
    }
}
