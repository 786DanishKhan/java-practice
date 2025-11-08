package LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Solution19 bt = new Solution19();
        System.out.println(bt.postorderTraversal(root));
    }
}
class Solution19{
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
         return result;
     }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()) {
            TreeNode curr = stack1.pop();
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
