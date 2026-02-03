package leetcode150.one_dimensional_dp;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return climbStairsUtility(n, map);
    }

    public int climbStairsUtility(int n, Map<Integer, Integer> map) {
        if (n <= 2) return n;
        // avoid repeating recursion steps:
        if (!map.containsKey(n)) map.put(n, climbStairsUtility(n - 1, map) + climbStairsUtility(n - 2, map));
        return map.get(n);
    }

    // time complexity O(2^n), it times out
    public int climbStairsRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }
}
