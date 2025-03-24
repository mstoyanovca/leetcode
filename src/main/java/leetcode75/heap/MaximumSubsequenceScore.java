package leetcode75.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

// problem 51:
public class MaximumSubsequenceScore {
    public long maxScore(int[] numbers1, int[] numbers2, int k) {
        long result = 0;
        long sum = 0;
        // numbers1.length = numbers2.length
        int[][] numbers_i = new int[numbers1.length][2];
        for (int i = 0; i < numbers1.length; ++i) numbers_i[i] = new int[]{numbers2[i], numbers1[i]};
        Arrays.sort(numbers_i, (a, b) -> b[0] - a[0]);

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int[] tuple : numbers_i) {
            queue.add(tuple[1]);
            sum += tuple[1];
            if (queue.size() > k) sum -= queue.remove();
            if (queue.size() == k) result = Math.max(result, (sum * tuple[0]));
        }

        return result;
    }
}
