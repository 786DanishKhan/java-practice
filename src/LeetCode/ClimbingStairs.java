package LeetCode;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        Solution14 cs = new Solution14();
        int ways = cs.climbStairs(n);
        System.out.println(ways);
    }
}
class Solution14 {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}