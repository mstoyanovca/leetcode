package leet_code_75.binary_tree_bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * DFS stands for Depth First Search;
 * it builds the tree subtree by subtree;
 * it uses stack data structure;
 * it works on the concept of LIFO;
 * it is more suitable when there are solutions away from source;
 * BFS stands for Breadth First Search;
 * it builds the tree level by level;
 * it uses Queue data structure for finding the shortest path;
 * it works on the concept of FIFO;
 * it is more suitable for searching vertices closer to the given source;
 */
public class BinaryTreeRightSideView {
    private final Queue<TreeNode> queue = new ArrayDeque<>();
    private final List<Integer> result = new ArrayList<>();

    // Queue/FIFO:
    List<Integer> rightSideView(TreeNode root) {
        if (root == null) return result;
        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.remove();
                if (i == 0) result.add(node.val);
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }

        return result;
    }
}
