package leetcode150.heap;

import java.util.*;

public class FindKPairsWithSmallestSum {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<List<Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(List::getFirst));
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < k && i < nums1.length; i++) {
            List<Integer> currentSum = new ArrayList<>();
            currentSum.add(nums1[i] + nums2[0]);
            currentSum.add(0);

            minHeap.add(currentSum);
        }

        while (k > 0 && !minHeap.isEmpty()) {
            List<Integer> currentSum = minHeap.remove();
            int sum = currentSum.get(0);
            int nums2Index = currentSum.get(1);
            int nums1Value = sum - nums2[nums2Index];

            List<Integer> currentPair = new ArrayList<>();
            currentPair.add(nums1Value);
            currentPair.add(nums2[nums2Index]);
            result.add(currentPair);

            if (nums2Index + 1 < nums2.length) {
                int newSum = sum - nums2[nums2Index] + nums2[nums2Index + 1];
                minHeap.add(List.of(newSum, nums2Index + 1));
            }

            k--;
        }

        return result;
    }
}
