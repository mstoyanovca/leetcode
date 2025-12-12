package leetcode150.hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs).map(s -> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }).collect(Collectors.groupingBy(Function.identity())).values().stream().toList();
    }
}
