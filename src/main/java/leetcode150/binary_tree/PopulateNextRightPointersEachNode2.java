package leetcode150.binary_tree;

public class PopulateNextRightPointersEachNode2 {
    public Node connect(Node root) {
        if (root == null) return null;

        if (root.left != null && root.right != null) root.left.next = root.right;
        if (root.left != null && root.left.right != null && root.right != null && root.right.left != null) root.left.right.next = root.right.left;

        root.left = connect(root.left);
        root.right = connect(root.right);
        return root;
    }
}
