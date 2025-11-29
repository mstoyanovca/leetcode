package leetcode150.array_string;

public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int leftWall = 0;
        int right = n - 1;
        int rightWall = 0;
        int volume = 0;

        // time complexity O(n)
        // space complexity O(1)
        while (left < right) {
            if (height[left] < height[right]) {
                // the bar on the right serves as a temporary right wall:
                leftWall = Math.max(leftWall, height[left]);
                if (height[left] < leftWall) volume += leftWall - height[left];
                left++;
            } else {
                // the bar on the left serves as a temporary left wall:
                rightWall = Math.max(rightWall, height[right]);
                if (height[right] < rightWall) volume += rightWall - height[right];
                right--;
            }
        }

        return volume;
    }

    public int trapSolution1(int[] height) {
        int n = height.length;
        int[] leftWalls = new int[n];
        int[] rightWalls = new int[n];
        int max = 0;
        int volume = 0;

        // time complexity O(n)
        // space complexity O(n)
        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            leftWalls[i] = max;
        }
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rightWalls[i] = max;
        }
        for (int i = 0; i < n; i++) {
            int level = Math.min(leftWalls[i], rightWalls[i]);
            volume += level - height[i];
        }

        return volume;
    }

    public int trapBruteForce1(int[] height) {
        int n = height.length;
        int left = -1;
        int right = 0;
        int volume = 0;

        // time complexity O(n)
        // space complexity O(1)
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

    public int trapBruteForce2(int[] height) {
        int n = height.length;
        int left = 0;
        int right = 0;
        int volume = 0;

        // time complexity O(n*n)
        // space complexity O(1)
        while (right < n) {
            // find a left wall:
            for (int i = left; i < n; i++) {
                if (i < n - 1 && height[i] > height[i + 1]) {
                    left = i;
                    break;
                }
            }
            // search for a right wall, taller than, or equal to the left wall first, possibly skipping lower ones:
            for (int i = left + 1; i < n; i++) {
                if (height[i] >= height[left]) {
                    right = i;
                    break;
                }
            }
            // only if such a right wall doesn't exist, search for a right wall, lower than the left one:
            if (right <= left) {
                for (int i = left + 1; i < n; i++) {
                    if (i < n - 1 && height[i] > height[i + 1]) {
                        right = i;
                        break;
                    }
                }
            }
            // add to volume:
            if (right - left > 1) {
                int level = Math.min(height[left], height[right]);
                for (int j = left + 1; j < right; j++) volume += Math.max(level - height[j], 0);
                if (right == n - 1) break;
                left = right;
            }
        }

        return volume;
    }
}
