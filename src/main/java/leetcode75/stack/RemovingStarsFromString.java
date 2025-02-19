package leetcode75.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class RemovingStarsFromString {
    public String removeStars(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            if (c != '*') {
                deque.add(c);
            } else {
                deque.removeLast();
            }
        }

        return deque.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
