package leetcode75.binary_tree_dfs;

// problem 37:
public class LongestZigZagPath {
    private enum Direction {LEFT, RIGHT}

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        /*return Math.max(
                Math.max(longestZigZag(root.left),
                        longestZigZag(root.right)),
                Math.max(root.left != null ? 1 + dfs(root.left, Direction.LEFT) : 0,
                        root.right != null ? 1 + dfs(root.right, Direction.RIGHT) : 0));*/
        return Math.max(
                root.left != null ? 1 + dfs(root.left, Direction.LEFT) : 0,
                root.right != null ? 1 + dfs(root.right, Direction.RIGHT) : 0);
    }

    private int dfs(TreeNode node, Direction direction) {
        if (node == null) return 0;
        Direction nextDirection = direction == Direction.LEFT ? Direction.RIGHT : Direction.LEFT;
        TreeNode nextNode = nextDirection == Direction.LEFT ? node.left : node.right;
        // this node might be a root of a longer zigzag path:
        return nextNode != null ? 1 + dfs(nextNode, nextDirection) : 0;
    }
}
