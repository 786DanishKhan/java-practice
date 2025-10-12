package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] num = {1,2,3,1};
        Solution12 cd = new Solution12();
        boolean hasDuplicate = cd.containsDuplicate(num);
        System.out.println(hasDuplicate);
    }
}
class Solution12 {
    public boolean containsDuplicate(int[] num) {
       // java.util.Arrays.sort();
        HashSet<Integer> seen = new HashSet<>();
        for (int n : num) {
            if (seen.contains(n)) {
                return true;
        }
            seen.add(n);
        }
        return false;
    }
}
