package leetcode75.heap;

import java.util.PriorityQueue;

// problem 52:
public class TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        // hire k workers, from # of either the first, or the last candidates, the smaller index breaks the tie;
        // use two pointers, moving towards each other:
        int i = 0;                 // left index
        int j = costs.length - 1;  // right index
        int totalCost = 0;
        PriorityQueue<Integer> minHeapLeft = new PriorityQueue<>();
        PriorityQueue<Integer> minHeapRight = new PriorityQueue<>();

        while (k-- > 0) {
            while (minHeapLeft.size() < candidates && i <= j) minHeapLeft.add(costs[i++]);
            while (minHeapRight.size() < candidates && i <= j) minHeapRight.add(costs[j--]);

            if (minHeapLeft.isEmpty()) {
                totalCost += minHeapRight.remove();
            } else if (minHeapRight.isEmpty()) {
                totalCost += minHeapLeft.remove();
            } else {
                // !minHeapLeft.isEmpty() && !minHeapRight.isEmpty(), the smaller index breaks the tie:
                totalCost += (minHeapLeft.peek() < minHeapRight.peek()) ? minHeapLeft.remove() : minHeapRight.remove();
            }
        }

        return totalCost;
    }
}
