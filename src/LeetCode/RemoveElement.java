package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,3,2,2,2};
        int val = 3;
        Solution2 solution = new Solution2();
        int k = solution.removeElement(nums, val);
        System.out.println(k);
}
}
class Solution2{
    public int removeElement(int[] nums, int val){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
