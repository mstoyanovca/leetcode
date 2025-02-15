package leetcode75.prefix_sum;

public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int height = 0;
        int maxHeight = 0;

        for (int j : gain) {
            height = height + j;
            maxHeight = Math.max(height, maxHeight);
        }

        return maxHeight;
    }
}
