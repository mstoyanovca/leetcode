package leet_code_75.binary_tree_dfs;

// problem 35:
public class CountGoodNodesInBinaryTree {
    int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int max) {
        if (node == null) return 0;
        max = Math.max(max, node.val);
        return (node.val >= max ? 1 : 0) + dfs(node.left, max) + dfs(node.right, max);
    }
}
