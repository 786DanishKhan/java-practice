package leetcodequest;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int [] nums = {1,2,1};
        SolutionQ1 Q1 = new SolutionQ1();
        int[] ca = Q1.getConcatenation(nums);
        System.out.println(ca);
    }
}

class SolutionQ1 {
    public int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return  ans;
    }
}
