package geeksforgeeks;

public class SortedArraySearch {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 6};
        int k = 6;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]==k){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
