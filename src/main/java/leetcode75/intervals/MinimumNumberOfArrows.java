package leetcode75.intervals;

import java.util.Arrays;
import java.util.Comparator;

// problem 73:
// MinimumNumberOfArrowsToBurstBalloons
public class MinimumNumberOfArrows {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int arrows = 1;
        int lastEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (lastEnd < points[i][0]) {
                lastEnd = points[i][1];
                arrows++;
            }
        }

        return arrows;
    }
}
