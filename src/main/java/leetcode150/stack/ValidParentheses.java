package leetcode150.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');

        // I assume:
        // time complexity O(n)
        // space complexity O(1) (give or take)
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                // it's an opening symbol:
                deque.add(c);
            } else {
                // it's a closing symbol:
                if (deque.isEmpty()) return false;
                if (map.get(c) != deque.removeLast()) return false;
            }
        }

        return deque.isEmpty();
    }
}
