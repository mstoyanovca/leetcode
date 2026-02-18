package top_interview_150.binary_tree_bfs;

import top_interview_150.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    private final Queue<TreeNode> queue = new ArrayDeque<>();
    private final List<Double> result = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sumPerLevel = 0;
            double nodesPerLevel = 0;

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();

                sumPerLevel += current.val;
                nodesPerLevel++;

                if (current.right != null) queue.add(current.right);
                if (current.left != null) queue.add(current.left);
            }

            result.add(sumPerLevel / nodesPerLevel);
        }

        return result;
    }
}
