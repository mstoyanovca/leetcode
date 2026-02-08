package leetcode150.multidimensional_dp;

import java.util.List;

public class Triangle {
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
}
