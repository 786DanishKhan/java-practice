package leetcodequest;

import java.util.ArrayList;
import java.util.List;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length;
        SolutionQ2 SA = new SolutionQ2();
        int[] shuffle = SA.shuffleArray(nums,n);
        System.out.println(shuffle);
    }
}

class SolutionQ2{
    public int[] shuffleArray(int[] nums, int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(nums[i]);
        list.add(nums[i+n]);
        }

        int[] result = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
           result[i] = list.get(i);
           }
      return result;
}
}