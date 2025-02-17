package leetcode75.hashmap_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] array) {
        Map<Integer, Integer> valueToOccurrences = new HashMap<>();

        for (int i : array) {
            int occurrences = valueToOccurrences.getOrDefault(i, 0) + 1;
            valueToOccurrences.put(i, occurrences);
        }

        return valueToOccurrences.size() == new HashSet<>(valueToOccurrences.values()).size();
    }
}
