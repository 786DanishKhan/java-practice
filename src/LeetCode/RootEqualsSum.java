package LeetCode;

public class RootEqualsSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        Solution2236 equal = new Solution2236();
        boolean sum = equal.rootEqual(root);
        System.out.println(sum);
    }
}

class Solution2236{
    public boolean rootEqual(TreeNode root){
        int sum = root.left.val + root.right.val;
        return sum == root.val;
    }
}