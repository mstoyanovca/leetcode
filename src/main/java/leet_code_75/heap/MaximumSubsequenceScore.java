package leet_code_75.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        // numbers1.length = numbers2.length
        int n = nums1.length;
        int[][] tuples = new int[n][2];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0;
        long result = 0;

        for (int i = 0; i < n; ++i) tuples[i] = new int[]{nums1[i], nums2[i]};
        Arrays.sort(tuples, (a, b) -> b[1] - a[1]);

        for (int[] tuple : tuples) {
            minHeap.add(tuple[0]);
            sum += tuple[0];
            if (minHeap.size() > k) sum -= minHeap.remove();
            if (minHeap.size() == k) result = Math.max(result, (sum * tuple[1]));
        }

        return result;
    }
}
