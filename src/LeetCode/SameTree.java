/*
package LeetCode;
import java.util.Stack;

public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Solution21 st = new Solution21();
        boolean isSame = st.isSameTree(p, q);
        System.out.println(isSame);
    }
}

class Solution21 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(p);
        stack2.push(q);
        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            TreeNode node1 = stack1.pop();
            TreeNode node2 = stack2.pop();

            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null) {
                return false;
            }
            if (node1.val != node2.val) {
                return false;
            }

            stack1.push(node1.right);
            stack2.push(node2.right);

            stack1.push(node1.left);
            stack2.push(node2.left);
        }
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

*/
