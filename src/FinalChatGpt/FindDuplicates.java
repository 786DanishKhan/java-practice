package FinalChatGpt;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 9, 2, 7, 3};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // avoid printing multiple times
                }
            }
        }
    }
}
