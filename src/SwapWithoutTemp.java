public class SwapWithoutTemp {
    //Done
    public static void main(String[] args) {
        int a = 88;
        int b = 98;
        //swap value
        System.out.println("Before swap; a =" +a+ ", b =" +b);

        //swap without using a temp variable
        a = a+b; // a = 178
        b=a-b; // b = 178 - 98 = 88
        a=a-b; // a = 178 - 88 = 98

        System.out.println("After swap;a=" +a+ ", b=" +b);
    }
}
