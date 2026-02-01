package leetcode150.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    private final Queue<Integer> minHeap;
    private final Queue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.remove());
        if (minHeap.size() > maxHeap.size()) maxHeap.add(minHeap.remove());
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.element();
        } else {
            return (minHeap.element() + maxHeap.element()) / 2.0;
        }
    }
}
