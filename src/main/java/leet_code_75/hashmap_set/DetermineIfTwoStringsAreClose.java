package leet_code_75.hashmap_set;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> charToOccurrences1 = new TreeMap<>();
        Map<Character, Integer> charToOccurrences2 = new TreeMap<>();

        for (char c : word1.toCharArray()) {
            charToOccurrences1.put(c, charToOccurrences1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            charToOccurrences2.put(c, charToOccurrences2.getOrDefault(c, 0) + 1);
        }

        if (!charToOccurrences1.keySet().equals(charToOccurrences2.keySet())) return false;

        List<Integer> values1 = charToOccurrences1.values().stream().sorted().toList();
        List<Integer> values2 = charToOccurrences2.values().stream().sorted().toList();
        return values1.equals(values2);
    }
}
