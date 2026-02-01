package leetcode150.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    private final Queue<Double> minHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        minHeap.add((double) num);
    }

    public double findMedian() {
        List<Double> temp = new ArrayList<>(minHeap);
        int length = minHeap.size();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            double left = temp.get(middleIndex - 1);
            double right = temp.get(middleIndex);
            return (left + right) / 2;
        } else {
            return temp.get(middleIndex);
        }
    }
}
