package leetcode150.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKPairsWithSmallestSum {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<List<Integer>> minHeap = new PriorityQueue<>((a, b) -> a.get(0) + a.get(1) - b.get(0) - b.get(1));
        List<List<Integer>> result = new ArrayList<>();

        /*for (int i = 0; i < nums1.length; i++) {
            List<Integer> current = new ArrayList<>();
            current.add()
            minHeap.add(new ArrayList<>())
        }*/
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                minHeap.add(List.of(nums1[i], nums2[j]));
            }
        }

        for (int i = 0; i < k; i++) result.add(minHeap.remove());

        return result;
    }
}
