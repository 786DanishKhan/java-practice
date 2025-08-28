package FinalChatGpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EvenOddFilter {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //sc.close();
        int n = 10;
        if(n%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int num : numbers){
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        System.out.println("original numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
