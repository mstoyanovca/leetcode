package leetcode150.divide_conquer;

public class QuadTree {
    public Node construct(int[][] grid) {
        return divideAndConquer(0, 0, grid, grid.length);
    }

    private Node divideAndConquer(int i, int j, int[][] grid, int length) {
        if (length == 1) return new Node(grid[i][j] == 1, true, null, null, null, null);

        Node result = new Node();
        Node topLeft = divideAndConquer(i, j, grid, length / 2);
        Node topRight = divideAndConquer(i, j + length / 2, grid, length / 2);
        Node bottomLeft = divideAndConquer(i + length / 2, j, grid, length / 2);
        Node bottomRight = divideAndConquer(i + length / 2, j + length / 2, grid, length / 2);
        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
            result.isLeaf = true;
            result.val = topLeft.val;
        } else {
            result.topLeft = topLeft;
            result.topRight = topRight;
            result.bottomLeft = bottomLeft;
            result.bottomRight = bottomRight;
        }
        return result;
    }
}
