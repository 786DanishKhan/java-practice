public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i<n; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                break;
            }
            else {
                System.out.println("Prime:" +n);
            }
        }
    }
}
