/*
package LeetCode;
public class DeleteNodeInBst {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        inorderTraversal(root);
        System.out.println();

        deleteNode(root, 3);

        inorderTraversal(root);
    }

    public static void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }

    public static TreeNode minValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static TreeNode deleteNode(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (val < node.val) {
            node.left = deleteNode(node.left, val);
        } else if (val > node.val) {
            node.right = deleteNode(node.right, val);
        } else {
            // Node with only one child or no child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            node.val = minValueNode(node.right).val;
            // Delete the inorder successor
            node.right = deleteNode(node.right, node.val);
        }
        return node;
    }
}
*/
