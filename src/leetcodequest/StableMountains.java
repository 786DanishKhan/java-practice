package leetcodequest;

import java.util.ArrayList;
import java.util.List;


public class StableMountains {
    public static void main(String[] args) {
        int[] height = {1,2,3,4,5};
        int threshold = 2;
        Solution3285 sm = new Solution3285();
        List<Integer> stable = sm.stableMountain(height,threshold);
        System.out.println(stable);
    }
}

class Solution3285{
    public List<Integer> stableMountain(int[] height, int threshold) {
        List<Integer> stableMountainIndices = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i-1] > threshold) {
                stableMountainIndices.add(i);
            }
        }
        return stableMountainIndices;
    }
}