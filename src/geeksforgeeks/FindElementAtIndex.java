package geeksforgeeks;
//Done
public class FindElementAtIndex {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key = 2;

        if(arr.length==0||key>arr.length||key<0){
            System.out.println();
        }else{
            System.out.println(arr[key]);
        }
    }
}
