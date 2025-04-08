package leetcode75.intervals;

import java.util.Arrays;
import java.util.Comparator;

// problem 72:
// each interval has length 2;
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int result = 0;
        int current = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (current > intervals[i][0]) {
                result++;
            } else {
                current = intervals[i][1];
            }
        }

        return result;
    }
}
