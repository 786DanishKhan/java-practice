package LeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        Solution32 ss = new Solution32();
        int missingNumber = ss.missingNumber(nums);
        System.out.println(missingNumber);
    }
}

class Solution32 {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}