public class ReverseNumber {
    public static void main(String[] args) {
        int number = 8265;
        int reverseNumber = 0;

        while(number!=0){
           int remainder =  number%10;
           number = number/10;

           reverseNumber = reverseNumber*10 + remainder;
        }

        System.out.println("reverse number" +reverseNumber);
        System.out.println("number" +number);
    }
}
