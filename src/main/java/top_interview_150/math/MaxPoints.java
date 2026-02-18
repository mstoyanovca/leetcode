package top_interview_150.math;

import java.util.HashMap;

public class MaxPoints {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int result = 1;

        for (int i = 0; i < n; i++) {
            HashMap<Double, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                double slope = (points[j][0] - points[i][0]) != 0 ? (double) (points[j][1] - points[i][1]) / (double) (points[j][0] - points[i][0]) : Integer.MAX_VALUE;
                map.put(slope, map.getOrDefault(slope, 1) + 1);
                result = Math.max(result, map.get(slope));
            }
        }

        return result;
    }
}
