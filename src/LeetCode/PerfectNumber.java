package LeetCode;

/*Definition: A perfect number is a positive integer
that is equal to the sum of its positive divisors, excluding the number itself.*/

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        Solution507 PN = new Solution507();
        boolean isPerfect = PN.checkPerfectNumber(num);
        System.out.println(isPerfect);
    }
}
class Solution507{
    public boolean checkPerfectNumber(int num){
        int sum = 0;
        int n = num/2;
        for (int i = 1; i<=n; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        return sum==num;
    }
}
