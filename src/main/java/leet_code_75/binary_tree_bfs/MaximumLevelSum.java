package leet_code_75.binary_tree_bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MaximumLevelSum {
    int maxLevelSum(TreeNode root) {
        if (root == null) return 0;

        final List<Integer> levelSums = new ArrayList<>();
        final Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int maxLevelSum = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            int level = queue.size();
            int currentLevelSum = 0;

            for (int i = 0; i < level; i++) {
                TreeNode currentNode = queue.remove();
                currentLevelSum += currentNode.val;

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            levelSums.add(currentLevelSum);
            maxLevelSum = Math.max(maxLevelSum, currentLevelSum);
        }

        for (int i = 0; i < levelSums.size(); i++) {
            if (levelSums.get(i) == maxLevelSum) return i + 1;
        }

        return 0;
    }
}
