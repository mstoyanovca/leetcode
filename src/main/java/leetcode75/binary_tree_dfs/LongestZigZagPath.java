package leetcode75.binary_tree_dfs;

// problem 37:
public class LongestZigZagPath {
    /*private enum Direction {LEFT, RIGHT}

    public int longestZigZag(TreeNode root) {
        return Math.max(dfs(root, Direction.LEFT), dfs(root, Direction.RIGHT));
    }

    private int dfs(TreeNode node, Direction direction) {
        if (node == null) return 0;
        Direction nextDirection = direction == Direction.LEFT ? Direction.RIGHT : Direction.LEFT;
        TreeNode nextNode = nextDirection == Direction.LEFT ? node.left : node.right;
        TreeNode nextRoot = nextDirection == Direction.LEFT ? node.right : node.left;
        return Math.max(
                nextNode != null ? 1 + dfs(nextNode, nextDirection) : 0,
                // this node might be a root of a new path:
                dfs(nextRoot, direction));
    }*/
    public int longestZigZag(TreeNode root) {
        return Math.max(dfs(root, "LEFT"), dfs(root, "RIGHT"));
    }

    private int dfs(TreeNode node, String direction) {
        if (node == null) return 0;
        String nextDirection = direction.equals("LEFT") ? "RIGHT" : "LEFT";
        TreeNode nextNode = nextDirection.equals("LEFT") ? node.left : node.right;
        TreeNode nextRoot = nextDirection.equals("LEFT") ? node.right : node.left;
        return Math.max(
                nextNode != null ? 1 + dfs(nextNode, nextDirection) : 0,
                // this node might be a root of a new path:
                dfs(nextRoot, direction));
    }
}
