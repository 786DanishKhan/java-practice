package geeksforgeeks;
//Done
public class FindAverageOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 55, 85, 52, 5, 2, 656, 554, 545};
        double sum = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        avg = sum/ arr.length;
        System.out.println(avg);// format to 2 decimal value
    }
}