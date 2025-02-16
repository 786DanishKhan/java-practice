public class SwapUsingTemp {
    //Done
    public static void main(String[] args) {
        int a = 17;
        int b = 80;
        //swap value
        System.out.println("Before swappin:a =" +a+ ",b =" +b);

        //swap using a temp variable
        int temp = a; // temp = 17
        a = b; // a = 80
        b = temp; // b = 17

        System.out.println("After swapping:a=" +a+ ", b =" +b);
    }
}
