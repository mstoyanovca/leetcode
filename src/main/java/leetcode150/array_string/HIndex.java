package leetcode150.array_string;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int h = 0;

        Arrays.sort(citations);
        /*
         * 0, 1, 3, 5, 6  h papers that have each been cited at least h times
         *                papers <= citations
         *                papersToCitation: 1->1, 3->3, 2->5, 1->6
         * 2, 2, 2        2->2
         */
        for (int i = 0; i < n; i++) {
            if (citations[i] == 0) continue;
            int numberOfCitations = citations[i];
            int papers = Math.min(numberOfCitations, n - i); // 1, 3, 2, 1
            h = Math.max(h, papers);
        }

        return h;
    }
}
