public class DuplicateArray {
    public static void main(String[] args) {
        int[] input = {12, 55, 56, 28, 16};
        int[] output = input;
        System.out.println("Input Array");
        //Printing input array
        for (int i = 0; i <= input.length - 1; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
        System.out.println("Output Array");
        //Printing output array
        for (int i = 0; i<= output.length - 1; i++){
            System.out.print(output[i]+" ");
        }
    }
}
