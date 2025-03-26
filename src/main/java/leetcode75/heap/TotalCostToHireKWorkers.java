package leetcode75.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// problem 52:
public class TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        // hire k workers, from # of either the first, or the last candidates, the smaller index breaks the tie;
        int totalCost = 0;
        List<List<Integer>> indexToCost = createIndexToCost(costs);
        PriorityQueue<List<Integer>> minHeapLeft = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(1)));
        PriorityQueue<List<Integer>> minHeapRight = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(1)));

        populateHeap(0, candidates, indexToCost, minHeapLeft);
        populateHeap(costs.length - candidates, costs.length, indexToCost, minHeapRight);
        // for (int i = 0; i < candidates; i++) minHeapLeft.add(indexToCost.get(i));
        // for (int i = costs.length - candidates; i < costs.length; i++) minHeapRight.add(indexToCost.get(i));

        for (int i = 0; i < k; i++) {
            if (!minHeapLeft.isEmpty() && !minHeapRight.isEmpty()) {
                List<Integer> worker;
                if (minHeapLeft.peek().get(1) <= minHeapRight.peek().get(1)) {
                    worker = minHeapLeft.remove();
                    indexToCost.remove(worker);
                    minHeapLeft.clear();
                    populateHeap(0, candidates, indexToCost, minHeapLeft);
                } else {
                    worker = minHeapRight.remove();
                    indexToCost.remove(worker);
                    minHeapRight.clear();
                    populateHeap(costs.length - candidates, costs.length, indexToCost, minHeapRight);
                }
                totalCost += worker.get(1);
                int x = 0;
            }
        }

        return totalCost;
    }

    private List<List<Integer>> createIndexToCost(int[] costs) {
        List<List<Integer>> indexToCost = new ArrayList<>();
        for (int i = 0; i < costs.length; i++) {
            List<Integer> worker = new ArrayList<>();
            worker.add(i);
            worker.add(costs[i]);
            indexToCost.add(worker);
        }
        return indexToCost;
    }

    private void populateHeap(int start, int end, List<List<Integer>> indexToCost, PriorityQueue<List<Integer>> heap) {
        for (int i = start; i < end; i++) heap.add(indexToCost.get(i));
    }
}
