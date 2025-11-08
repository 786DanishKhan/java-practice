package LeetCode;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        Solution1480 RS = new Solution1480();
        int[] runningSum = RS.runningSum(nums);
        System.out.println(Arrays.toString(runningSum));
    }
}
class Solution1480{
    public int[] runningSum(int[] nums){
        int sum = 0;
        int runningSum[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
