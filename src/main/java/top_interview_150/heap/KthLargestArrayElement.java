package top_interview_150.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestArrayElement {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums) maxHeap.add(i);
        for (int i = 1; i < k; i++) maxHeap.remove();
        return !maxHeap.isEmpty() ? maxHeap.remove() : -1;
    }

    // the requirement is to use a heap, but this works too:
    public int findKthLargestWithSort(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
