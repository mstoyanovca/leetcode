package top_interview_150.dp_1d;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    // recursion with memoization:
    // time complexity O(n)
    // space complexity O(n)
    public int climbStairs(int n) {
        return climbStairsUtility(n, new HashMap<>());
    }

    private int climbStairsUtility(int n, Map<Integer, Integer> memo) {
        if (n <= 2) return n;
        if (!memo.containsKey(n)) memo.put(n, climbStairsUtility(n - 1, memo) + climbStairsUtility(n - 2, memo));
        return memo.get(n);
    }

    // recursion:
    // time complexity O(2 ^ n), it times out in the LeetCode engine:
    public int climbStairsRecursive(int n) {
        if (n <= 2) return n;
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }
}
