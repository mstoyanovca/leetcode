package top_interview_150.array_string;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        // time complexity O(n)
        // space complexity O(1)
        for (int i = 0; i < n; i++) if (citations[i] >= n - i) return n - i;
        return 0;
    }
}
