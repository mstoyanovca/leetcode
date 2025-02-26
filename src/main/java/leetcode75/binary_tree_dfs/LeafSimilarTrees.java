package leetcode75.binary_tree_dfs;

import java.util.ArrayList;
import java.util.List;

// problem 34:
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return dfs(root1).equals(dfs(root2));
    }

    private List<Integer> dfs(TreeNode root) {
        List<Integer> leafs = new ArrayList<>();
        if (root == null) return leafs;

        leafs.addAll(dfs(root.left));
        leafs.addAll(dfs(root.right));

        if (root.left == null && root.right == null) leafs.add(root.val);
        return leafs;
    }
}
