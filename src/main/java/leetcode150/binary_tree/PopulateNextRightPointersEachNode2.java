package leetcode150.binary_tree;

public class PopulateNextRightPointersEachNode2 {
    public Node connect(Node root) {
        if (root == null) return null;

        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = findNextNodeFromAnotherSubtree(root);
            }
        }
        if (root.right != null) root.right.next = findNextNodeFromAnotherSubtree(root);

        root.left = connect(root.left);
        root.right = connect(root.right);
        return root;
    }

    private Node findNextNodeFromAnotherSubtree(Node root) {
        while (root.next != null) {
            if (root.next.left != null) return root.next.left;
            if (root.next.right != null) return root.next.right;
        }

        return null;
    }
}
