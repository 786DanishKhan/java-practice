public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 123;
        int pro = 1;

        while (num > 0){
            int remainder = num%10;
            num = num/10;
            pro = pro * remainder;
        }
        System.out.println(pro);
    }
}
