package top_interview_150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // assert intervals is at least 2 elements long, otherwise previous can not be used:
        if (intervals.length == 1) return intervals;

        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        int[] previous = intervals[0];

        // I assume:
        // time  complexity O(logN + N)
        // space complexity O(N)
        for (int i = 1; i < intervals.length; i++) {
            // if (previous[1] >= intervals[i][0] && previous[0] <= intervals[i][1]) {
            if (previous[1] >= intervals[i][0]) {
                // previous[1] = intervals[i][1];
                // interval[i][1] might be within previous, test case 4;
                previous[1] = Math.max(previous[1], intervals[i][1]);
            } else {
                merged.add(previous);
                previous = intervals[i];
            }
            // for loop would skip the last element:
            if (i == intervals.length - 1) merged.add(previous);
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
