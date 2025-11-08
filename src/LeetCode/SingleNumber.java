package LeetCode;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        Solution10 s10 = new Solution10();
        int[] nums = {4,1,2,1,2};
        int result = s10.singleNumber(nums);
        System.out.println(result);
    }
}
class Solution10 {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> oneNumber = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(oneNumber.containsKey(nums[i])){
                oneNumber.put(nums[i],oneNumber.get(nums[i])+1);
            }else{
                oneNumber.put(nums[i],1);
            }
        }
        for(int i : oneNumber.keySet()){
            if(oneNumber.get(i)==1){
                return i;
            }
        }
        return 0;
    }
}