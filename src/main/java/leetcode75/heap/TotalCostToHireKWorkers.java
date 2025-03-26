package leetcode75.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

// problem 52:
public class TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        // hire k workers, from # of either the first, or the last candidates
        int totalCost = 0;
        List<List<Integer>> indexToCost = createIndexToCost(costs);
        PriorityQueue<List<Integer>> minHeapLeft = new PriorityQueue<>();
        PriorityQueue<List<Integer>> minHeapRight = new PriorityQueue<>();

        List<Integer> x = indexToCost.get(0);
        minHeapLeft.add(x);
        for (int i = 0; i < candidates; i++) minHeapLeft.add(indexToCost.get(i));
        for (int i = costs.length - candidates; i < costs.length; i++) minHeapRight.add(indexToCost.get(i));

        for (int i = 0; i < k; i++) {
            if (!minHeapLeft.isEmpty() && !minHeapRight.isEmpty()) {
                List<Integer> worker;
                if (minHeapLeft.peek().get(1) < minHeapRight.peek().get(1)) {
                    worker = minHeapLeft.remove();
                } else if (minHeapLeft.peek().get(1) > minHeapRight.peek().get(1)) {
                    worker = minHeapRight.remove();
                } else {
                    // minHeapLeft.peek().get(1) == minHeapRight.peek().get(1), the smaller index breaks the tie:
                    worker = minHeapLeft.remove();
                }
                totalCost += worker.get(1);
            }
        }

        return totalCost;
    }

    private List<List<Integer>> createIndexToCost(int[] costs) {
        return IntStream.range(0, costs.length - 1).mapToObj(i -> {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(costs[i]);
            return list;
        }).toList();
    }
}
