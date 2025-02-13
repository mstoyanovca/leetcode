package leetcode75;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] numbers, int k) {
        int pairs = 0;
        int halves = 0;
        Map<Integer, Integer> acc = new HashMap<>();

        for (int number : numbers) {
            if (acc.containsKey(number)) {
                int count = acc.get(number);
                acc.put(number, count + 1);
            } else {
                acc.put(number, 1);
            }
        }

        for (int number : acc.keySet()) {
            int numberCount = acc.get(number);
            if (acc.containsKey(k - number)) {
                int complementCount = acc.get(k - number);
                if (number == (k - number)) {
                    halves = halves + numberCount / 2;
                } else {
                    pairs = pairs + Math.min(numberCount, complementCount);
                }
            }
        }

        return pairs / 2 + halves;
    }
}
