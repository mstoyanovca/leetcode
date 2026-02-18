package leet_code_75.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

// problem 51:
public class MaximumSubsequenceScore {
    public long maxScore(int[] numbers1, int[] numbers2, int k) {
        long result = 0;
        long sum = 0;
        // numbers1.length = numbers2.length
        int[][] tuples = new int[numbers1.length][2];
        for (int i = 0; i < numbers1.length; ++i) tuples[i] = new int[]{numbers1[i], numbers2[i]};
        // sort by the second element descending:
        Arrays.sort(tuples, (a, b) -> Integer.compare(b[1], a[1]));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int[] tuple : tuples) {
            maxHeap.add(tuple[0]);
            sum += tuple[0];
            if (maxHeap.size() > k) sum -= maxHeap.remove();
            if (maxHeap.size() == k) result = Math.max(result, (sum * tuple[1]));
        }

        return result;
    }
}
