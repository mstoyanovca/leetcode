package leetcode150.multidimensional_dp;

import java.util.List;

public class Triangle {
    // bottom-up DP approach: iterate from the second last row (n-2) up to the top (row 0)
    // time complexity O(n ^ 2)
    // space complexity O(1)
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        int previousRowIndex = 0;

        for (List<Integer> integers : triangle) {
            if (previousRowIndex + 1 <= integers.size() - 1 && integers.get(previousRowIndex + 1) < integers.get(previousRowIndex))
                previousRowIndex++;
            sum += integers.get(previousRowIndex);
        }

        return sum;
    }

    // top-down approach, won't work without recursion and memoization:
    public int minimumTotal2(List<List<Integer>> triangle) {
        int sum = 0;
        int previousRowIndex = 0;

        for (List<Integer> integers : triangle) {
            if (previousRowIndex + 1 <= integers.size() - 1 && integers.get(previousRowIndex + 1) < integers.get(previousRowIndex))
                previousRowIndex++;
            sum += integers.get(previousRowIndex);
        }

        return sum;
    }
}
