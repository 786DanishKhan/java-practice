package LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumHacker {
    public static void main(String[] args) {
        //int taskDurations = {2,7,11,15};
        int slotLength = 9;
        Solution35 TS = new Solution35();
       // List<Integer> result = TS.twoSum(List<Integer> taskDurations, slotLength);
       // System.out.println("Indices: " + result);
    }
}
class Solution35 {
    public List<Integer> twoSum(List<Integer> taskDurations, int slotLength) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < taskDurations.size(); i++) {
            int complement = slotLength - taskDurations.get(i);

            // If complement is already in the map, return indices
            if (map.containsKey(complement)) {
                return List.of(map.get(complement), i);
            }

            // Store current number with its index
            map.put(taskDurations.get(i), i);
        }

        // If no solution found (problem says always one solution exists)
        return List.of(-1, -1);
    }
}
