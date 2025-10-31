/*
package LeetCode;


import java.util.Stack;

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2() {}
    TreeNode2(int val) { this.val = val; }
    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution21 {
    public boolean isSameTree(TreeNode2 p, TreeNode2 q) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(p);
        stack2.push(q);
        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            TreeNode2 node1 = stack1.pop();
            TreeNode2 node2 = stack2.pop();

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
public class SameTree {
    public static void main(String[] args) {
        TreeNode2 p = new TreeNode2(1);
        p.left = new TreeNode2(2);
        p.right = new TreeNode2(3);

        TreeNode2 q = new TreeNode2(1);
        q.left = new TreeNode2(2);
        q.right = new TreeNode2(3);

        Solution21 st = new Solution21();
        boolean isSame = st.isSameTree(p, q);
        System.out.println(isSame);
    }
}*/
