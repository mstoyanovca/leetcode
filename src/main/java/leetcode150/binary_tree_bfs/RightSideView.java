package leetcode150.binary_tree_bfs;

import leetcode150.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    private final Queue<TreeNode> queue = new ArrayDeque<>();
    private final List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                if (i == 0) result.add(current.val);

                if (current.right != null) queue.add(current.right);
                if (current.left != null) queue.add(current.left);
            }
        }

        return result;
    }
}
