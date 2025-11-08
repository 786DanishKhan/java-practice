/*
package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution18 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
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
        TreeNode root = new TreeNode(1);
            root.right = new TreeNode(2);
            root.right.left = new TreeNode(3);
            Solution18 solution = new Solution18();
            List<Integer> result = solution.preorderTraversal(root);
            System.out.println(result); // Output: [1, 2, 3]
        }
}
*/
