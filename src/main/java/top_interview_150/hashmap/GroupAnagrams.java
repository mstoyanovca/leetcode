package top_interview_150.hashmap;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String> list = map.containsKey(key) ? map.get(key) : new ArrayList<>();
            list.add(s);
            map.put(key, list);
        }

        return map.values().stream().toList();
    }
}
