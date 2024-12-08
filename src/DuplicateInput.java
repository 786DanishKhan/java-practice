import java.util.Scanner;

public class DuplicateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter some number: ");
        int input = scanner.nextInt();
        int output = input;
        // Read the input from the user

        // Print the input back to the output
        System.out.println("You entered: " + output);

    }
}