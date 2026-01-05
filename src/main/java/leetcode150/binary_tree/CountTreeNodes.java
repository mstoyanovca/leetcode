package leetcode150.binary_tree;

public class CountTreeNodes {
    private int count = 0;

    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        countNodes(root.left);
        count++;
        countNodes(root.right);

        return count;
    }
}
