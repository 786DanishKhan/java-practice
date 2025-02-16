package practice;
//Done
public class CountSmallerElement {
    public static void main(String[] args) {
        int[] arr = {20, 5, 7, 8, 9, 10, 2, 1};
        int n = 10;
        int count = 0;

        for (int i = 0; i< arr.length; i++){
            if(arr[i]<=n){
                count++;
            }
        }
        System.out.println(count);
    }
}
