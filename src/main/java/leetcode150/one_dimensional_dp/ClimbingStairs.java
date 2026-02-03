package leetcode150.one_dimensional_dp;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // time complexity O(2^n), it times out
    public int climbStairsRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }
}
