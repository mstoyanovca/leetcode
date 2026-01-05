package leetcode150.binary_tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BSTIterator {
    private final Queue<Integer> queue = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        createList(root);
    }

    public int next() {
        return queue.remove();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    private void createList(TreeNode root) {
        if (root == null) return;
        createList(root.left);
        queue.add(root.val);
        createList(root.right);
    }
}
