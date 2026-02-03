package leetcode150.binary_search;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;

        // time complexity: O(log(m*n))
        // space complexity O(1)
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int i = middle / n;
            int j = middle - i * n;
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }
}
