package top_interview_150.hashmap;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        // time complexity O(n)
        // space complexity O(n
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String> value = map.containsKey(key) ? map.get(key) : new ArrayList<>();
            value.add(s);
            map.put(key, value);
        }

        return map.values().stream().toList();
    }
}
