package top_interview_150.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> deque = new ArrayDeque<>();

        // I assume:
        // space complexity O(n)
        // time complexity O(n)
        for (String dir : path.split("/")) {
            if (!dir.isEmpty() && !dir.equals(".")) {
                if (dir.equals("..")) {
                    if (!deque.isEmpty()) deque.removeLast();
                } else {
                    deque.add(dir);
                }
            }
        }

        return "/" + String.join("/", deque);
    }
}
