package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode0 {
    int val;
    TreeNode0 left;
    TreeNode0 right;
    TreeNode0() {}
    TreeNode0(int val) { this.val = val; }
    TreeNode0(int val, TreeNode0 left, TreeNode0 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeInorder {
    public static void main(String[] args) {
        TreeNode0 root = new TreeNode0(1);
        root.right = new TreeNode0(2);
        root.right.left = new TreeNode0(3);
        Solution20 solution = new Solution20();
        System.out.println(solution.inorderTraversal(root));
    }
}
class Solution20 {
    public List<Integer> inorderTraversal(TreeNode0 root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode0> stack = new Stack<>();
        TreeNode0 current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}