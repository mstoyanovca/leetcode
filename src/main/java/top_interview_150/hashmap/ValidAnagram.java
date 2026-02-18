package top_interview_150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    // I assume:
    // time complexity O(n)
    // space complexity O(n)
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                if (map.get(c) > 1) {
                    map.put(c, map.get(c) - 1);
                } else {
                    map.remove(c);
                }
            }
        }

        return map.isEmpty();
    }
}
