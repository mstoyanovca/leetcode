package leetcode150.intervals;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        /*
        *  key points:
        *  intervals is non-overlapping
        *  intervals is sorted
        */
        if (intervals.length == 0) return new int[][]{newInterval};

        for (int i = 0; i < intervals.length; i++) {
            if (newInterval[0] >= intervals[i][0] && newInterval[0] <= intervals[i][1]) {
                intervals[i] = new int[]{intervals[i][0], Math.max(intervals[i][1], newInterval[1])};
            }
        }

        return intervals;
    }
}
