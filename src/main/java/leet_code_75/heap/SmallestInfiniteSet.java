package leet_code_75.heap;

import java.util.PriorityQueue;

class SmallestInfiniteSet {
    private final PriorityQueue<Integer> minQueue = new PriorityQueue<>();

    public SmallestInfiniteSet() {
        // for (int i = 1; i < Integer.MAX_VALUE; i++) minQueue.add(i);
        for (int i = 1; i < 1_001; i++) minQueue.add(i);
    }

    public int popSmallest() {
        return minQueue.remove();
    }

    public void addBack(int num) {
        if (!minQueue.contains(num)) minQueue.add(num);
    }
}
