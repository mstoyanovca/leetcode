package top_interview_150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    // I assume:
    // time complexity O(n)
    // space complexity O(n)
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            if (!map.containsKey(key)) {
                if (map.containsValue(value)) {
                    return false;
                } else {
                    map.put(key, value);
                }
            } else {
                if (map.get(key) != value) return false;
            }
        }

        return true;
    }
}
