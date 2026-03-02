package top_interview_150.binary_tree_bfs;

import java.util.Objects;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TreeNode treeNode)) return false;
        return val == treeNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(val);
    }
}
