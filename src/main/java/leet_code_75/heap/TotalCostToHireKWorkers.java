package leet_code_75.heap;

import java.util.PriorityQueue;

public class TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        // hire k workers, from # of either the first, or the last candidates, the smaller index breaks the tie;
        // use two pointers, moving towards each other:
        int left = 0;
        int right = costs.length - 1;
        PriorityQueue<Integer> leftMinHeap = new PriorityQueue<>();
        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();
        long totalCost = 0;

        while (k-- > 0) {
            while (leftMinHeap.size() < candidates && left <= right) leftMinHeap.add(costs[left++]);
            while (rightMinHeap.size() < candidates && left <= right) rightMinHeap.add(costs[right--]);

            if (leftMinHeap.isEmpty()) {
                totalCost += rightMinHeap.remove();
            } else if (rightMinHeap.isEmpty()) {
                totalCost += leftMinHeap.remove();
            } else {
                // !minHeapLeft.isEmpty() && !minHeapRight.isEmpty(), the smaller index breaks the tie:
                totalCost += (leftMinHeap.peek() < rightMinHeap.peek()) ? leftMinHeap.remove() : rightMinHeap.remove();
            }
        }

        return totalCost;
    }
}
