package top_interview_150.array_string;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int hIndex = 0;

        Arrays.sort(citations);

        // time complexity O(n)
        // space complexity O(1)
        for (int i = 0; i < n; i++) hIndex = Math.max(hIndex, Math.min(citations[i], n - i));

        return hIndex;
    }
}
