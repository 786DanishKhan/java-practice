package geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoNumbers {
    public static void main(String[] args) {
       /* int a = 8,b = 10;
        List<Integer> list=new ArrayList<>();
        list.add(b);
        list.add(a);

        System.out.println(list);*/

        int a = 8;
        int b = 12;
        System.out.println("Before swapping:" +a+ " " +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:" +a+ " " +b);
    }
}
