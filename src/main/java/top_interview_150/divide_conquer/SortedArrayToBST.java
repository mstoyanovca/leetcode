package top_interview_150.divide_conquer;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return divideAndConquer(0, nums.length - 1, nums);
    }

    private TreeNode divideAndConquer(int left, int right, int[] nums) {
        if (left > right) return null;

        int middle = (left + right) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = divideAndConquer(left, middle - 1, nums);
        root.right = divideAndConquer(middle + 1, right, nums);
        return root;
    }
}
