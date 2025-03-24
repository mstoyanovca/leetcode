package leetcode75.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

// problem 48:
/* PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
   PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder()); */
public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums) maxHeap.add(i);
        for (int i = 1; i < k; i++) {
            maxHeap.remove();
        }
        return !maxHeap.isEmpty() ? maxHeap.peek() : -1;
    }
}
