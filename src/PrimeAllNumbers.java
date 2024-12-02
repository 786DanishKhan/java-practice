import java.util.Scanner;

public class PrimeAllNumbers {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter NUmber");
        int num = obj.nextInt();
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= num; j++) {
            if((i % j) == 0) {
                count++;
            }
            }
            if(count==2){
                System.out.println(i+ "");
            }
        }
    }
}
