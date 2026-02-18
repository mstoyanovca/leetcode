package top_interview_150.array_string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int n = s.length();
        Map<Character, Integer> map = createMap();
        int result = 0;

        // time complexity O(n);
        // space complexity O(1);
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                // lookahead is needed for the deducting case only:
                result -= map.get(s.charAt(i));
            } else {
                // there is no need for lookahead for the last element:
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }

    private Map<Character, Integer> createMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
