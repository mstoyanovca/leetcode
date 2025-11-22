package leetcode150.array_string;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int h = 0;

        Arrays.sort(citations);
        for (int i = 0; i < n; i++) if (citations[i] == n - i) return citations[i];

        return h;
    }
}
