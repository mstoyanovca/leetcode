package top_interview_150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    // time complexity O(m + n)
    // space complexity O(1) ?!
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
