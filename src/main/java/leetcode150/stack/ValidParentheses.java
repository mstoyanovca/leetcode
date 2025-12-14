package leetcode150.stack;

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        List<Character> opening = List.of('(', '{', '[');
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');

        // I assume:
        // time complexity O(n)
        // space complexity O(1)
        for (char c : s.toCharArray()) {
            if (opening.contains(c)) {
                deque.add(c);
            } else {
                // it's a closing symbol:
                char u = deque.removeLast();
                if (map.get(c) != u) return false;
            }
        }

        return true;
    }
}
