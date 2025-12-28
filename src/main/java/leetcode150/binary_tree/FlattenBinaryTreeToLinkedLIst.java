package leetcode150.binary_tree;

public class FlattenBinaryTreeToLinkedLIst {
    public void flatten(TreeNode root) {
        TreeNode current = root;

        while (current != null) {
            if (current.left != null) {
                TreeNode previous = current.left;
                while (previous.right != null) previous = previous.right;
                previous.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}
