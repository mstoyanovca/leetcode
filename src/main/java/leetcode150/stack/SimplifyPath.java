package leetcode150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> deque = new ArrayDeque<>();

        // I assume:
        // space complexity O(n)
        // time complexity O(n)
        for (String s : path.split("/")) {
            if (s.isEmpty() || s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (!deque.isEmpty()) deque.removeLast();
            } else {
                deque.add(s);
            }
        }

        return "/" + String.join("/", deque);
    }
}
