package leetcode150.array_string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Map<Integer, Integer> occurrences = new HashMap<>();
        int h = 0;

        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            if (citations[i] == 0) continue;
            int key = citations[i];
            if (!occurrences.containsKey(key)) occurrences.put(key, n - i);
            if (key >= occurrences.get(key)) {
                h = occurrences.get(key);
                break;
            }
        }

        return h == 0 && !occurrences.isEmpty() ? 1 : h;
    }
}
