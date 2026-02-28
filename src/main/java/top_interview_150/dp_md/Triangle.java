package top_interview_150.dp_md;

import java.util.List;

public class Triangle {
    // bottom-up DP approach: iterate from the second last row (n-2) up to the top (row 0)
    // for each cell (i, j), compute triangle[i][j] + min(triangle[i+1][j], triangle[i+1][j+1])
    // triangle[0][0] will contain the minimum path sum
    // update the triangle in-place
    // time complexity O(n ^ 2)
    // space complexity O(1)
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            // for (int j = 0; j <= triangle.get(i).size() - 1; j++) {
            for (int j = 0; j <= i; j++) {
                int temp = triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, temp);
            }
        }

        return triangle.getFirst().getFirst();
    }

    // top-down approach, won't work without recursion and memoization:
    public int minimumTotal2(List<List<Integer>> triangle) {
        int sum = 0;
        int previousRowIndex = 0;

        for (List<Integer> integers : triangle) {
            if (previousRowIndex + 1 <= integers.size() - 1 && integers.get(previousRowIndex + 1) < integers.get(previousRowIndex)) previousRowIndex++;
            sum += integers.get(previousRowIndex);
        }

        return sum;
    }
}
