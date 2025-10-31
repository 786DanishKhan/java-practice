package LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode0 left;
    TreeNode0 right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode0 left, TreeNode0 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreePostorder {
    public static void main(String[] args) {
        TreeNode0 root = new TreeNode0(1);
        root.right = new TreeNode0(2);
        root.right.left = new TreeNode0(3);
        Solution19 bt = new Solution19();
        System.out.println(bt.postorderTraversal(root));
    }
}
class Solution19{
    public List<Integer> postorderTraversal(TreeNode0 root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
         return result;
     }
        Stack<TreeNode0> stack1 = new Stack<>();
        Stack<TreeNode0> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()) {
            TreeNode0 curr = stack1.pop();
            stack2.push(curr);

            if (curr.right != null)
                stack1.push(curr.right);
            if (curr.left != null)
                stack1.push(curr.left);
            }

        while(!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }
               return result;
    }
}
