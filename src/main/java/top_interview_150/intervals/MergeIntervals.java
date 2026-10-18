package top_interview_150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] previous = intervals[0];
        List<int[]> result = new ArrayList<>();

        // time  complexity O(logN )
        // space complexity O(N)
        for (int i = 1; i < intervals.length; i++) {
            if (previous[1] >= intervals[i][0]) {
                previous[1] = Math.max(previous[1], intervals[i][1]);
            } else {
                result.add(previous);
                previous = intervals[i];
            }
        }

        // the for loop skips the last element:
        result.add(previous);

        return result.toArray(new int[result.size()][]);
    }
}
