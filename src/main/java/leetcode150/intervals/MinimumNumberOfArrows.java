package leetcode150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumNumberOfArrows {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        // List<Integer> arrows = new ArrayList<>();
        int arrows = 0;
        int pointer = points[0][1];

        for (int i = 0; i < points.length - 1; i++) {
            if (points[i][1] >= points[i + 1][0] && points[i][1] <= points[i + 1][1]) {
                int arrow = points[i][1];
                arrows.add(arrow);
            }
        }

        return arrows.size();
    }
}
