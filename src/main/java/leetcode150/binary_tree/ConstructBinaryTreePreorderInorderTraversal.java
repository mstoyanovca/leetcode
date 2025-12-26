package leetcode150.binary_tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreePreorderInorderTraversal {
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(preorder, map, 0, preorder.length - 1);
    }

    private TreeNode helper(int[] preorder, Map<Integer, Integer> map, int subtreeStart, int subtreeEnd) {
        if (subtreeStart > subtreeEnd) return null;
        int rootVal = preorder[index];
        index++;
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(preorder, map, subtreeStart, map.get(rootVal) - 1);
        root.right = helper(preorder, map, map.get(rootVal) + 1, subtreeEnd);
        return root;
    }
}
