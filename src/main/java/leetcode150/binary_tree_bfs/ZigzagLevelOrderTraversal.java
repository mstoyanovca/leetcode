package leetcode150.binary_tree_bfs;

import leetcode150.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean reverse = false;

        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                level.add(current.val);

                if (current.right != null) queue.add(current.right);
                if (current.left != null) queue.add(current.left);
            }

            reverse = !reverse;
            result.add(reverse ? level.reversed() : level);
        }

        return result;
    }
}
