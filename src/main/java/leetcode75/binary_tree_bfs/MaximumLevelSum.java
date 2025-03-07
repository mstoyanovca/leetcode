package leetcode75.binary_tree_bfs;

import leetcode75.binary_tree_dfs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// problem 40:
public class MaximumLevelSum {
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> nodesPerLevel = new LinkedList<>();
        nodesPerLevel.add(root);
        int maxLevelSum = root.val;
        List<Integer> sumsPerLevel = new ArrayList<>();

        while (!nodesPerLevel.isEmpty()) {
            int currentLevelSum = nodesPerLevel.stream().mapToInt(n -> n.val).sum();
            maxLevelSum = Math.max(maxLevelSum, currentLevelSum);
            sumsPerLevel.add(currentLevelSum);

            int size = nodesPerLevel.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodesPerLevel.remove();
                if (node.left != null) nodesPerLevel.add(node.left);
                if (node.right != null) nodesPerLevel.add(node.right);
            }
        }

        for (int i = 0; i < sumsPerLevel.size(); i++) {
            if (sumsPerLevel.get(i) == maxLevelSum) return i + 1;
        }
        return 0;
    }
}
