package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1() {}
    TreeNode1(int val) { this.val = val; }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution18 {
    public List<Integer> preorderTraversal(TreeNode1 root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode1> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode1 curr = stack.pop();
            result.add(curr.val);  // Visit root first

            // Push right first so that left is processed first
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
        }

        return result;
    }
}

public class BinaryTreePreorder {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
            root.right = new TreeNode1(2);
            root.right.left = new TreeNode1(3);
            Solution18 solution = new Solution18();
            List<Integer> result = solution.preorderTraversal(root);
            System.out.println(result); // Output: [1, 2, 3]
        }
}
