package leetcode75.bit_manipulation;

// problem 67:
public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) ans[i] = Integer.toBinaryString(i).replaceAll("0", "").length();
        return ans;
    }
}
