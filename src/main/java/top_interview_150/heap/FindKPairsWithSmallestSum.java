package top_interview_150.heap;

import java.util.*;

public class FindKPairsWithSmallestSum {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<List<Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(List::getFirst));
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < k && i < nums1.length; i++) minHeap.add(List.of(nums1[i] + nums2[0], 0));

        while (k > 0 && !minHeap.isEmpty()) {
            List<Integer> currentSum = minHeap.remove();
            int sum = currentSum.get(0);
            int nums2Index = currentSum.get(1);
            int nums1Value = sum - nums2[nums2Index];

            result.add(List.of(nums1Value, nums2[nums2Index]));

            if (nums2Index + 1 < nums2.length) minHeap.add(List.of(sum - nums2[nums2Index] + nums2[nums2Index + 1], nums2Index + 1));
            k--;
        }

        return result;
    }
}
