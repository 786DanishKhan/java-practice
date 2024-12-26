public class DuplicateArrayUsingLoop {
    public static void main(String[] args) {
        int[] input = {12, 55, 28, 28};
        int[] output = new int[input.length];

        System.out.println(input.length);

        for (int i = 0; i< input.length; i++) {
            System.out.print(input[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i< output.length; i++){
            output[i] = input[i];
            System.out.print(output[i]+ " ");
        }
    }
}
