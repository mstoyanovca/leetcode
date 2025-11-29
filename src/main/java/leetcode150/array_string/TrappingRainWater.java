package leetcode150.array_string;

public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int left = -1;
        int right = 0;
        int volume = 0;

        for (int i = 0; i < n; i++) {
            // taller than its neighbours, it's a wall:
            boolean firstElementPredicate = n > 1 && i == 0 && height[0] > height[1];
            boolean middleElementPredicate = i > 0 && i < n - 1 && height[i] > height[i + 1] && height[i] > height[i - 1];
            boolean lastElementPredicate = n > 1 && i == n - 1 && height[n - 1] > height[n - 2];
            if (firstElementPredicate) {
                left = 0;
            } else if (middleElementPredicate) {
                if (left == -1) {
                    // it's the leftmost wall:
                    left = i;
                } else {
                    // it's a right wall:
                    right = i;
                }
            } else if (lastElementPredicate) {
                right = n - 1;
            }
            if (left != -1 && right - left > 1) {
                int level = Math.min(height[left], height[right]);
                for (int j = left + 1; j < right; j++) volume += Math.max(level - height[j], 0);
                left = right;
            }
        }

        return volume;
    }
}
