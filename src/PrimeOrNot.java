public class PrimeOrNot {
    //Done
    public static void main(String[] args) {
        int num = 4;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is Not prime");
        }
    }
}
