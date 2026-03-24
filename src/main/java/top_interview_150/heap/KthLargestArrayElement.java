package top_interview_150.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestArrayElement {
    // time complexity O(n + k)
    // space complexity O(n)
    public int findKthLargest(int[] nums, int k) {
        // return Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray()[k - 1];
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) maxHeap.add(num);
        for (int i = 1; i < k; i++) maxHeap.remove();
        return !maxHeap.isEmpty() ? maxHeap.remove() : -1;
    }
}
