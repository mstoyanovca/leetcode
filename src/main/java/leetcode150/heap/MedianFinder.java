package leetcode150.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianFinder {
    private final List<Double> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        list.add((double) num);
    }

    public double findMedian() {
        Collections.sort(list);
        int length = list.size();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            double left = list.get(middleIndex - 1);
            double right = list.get(middleIndex);
            return (left + right) / 2;
        } else {
            return list.get(middleIndex);
        }
    }
}
