package leet_code_75.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class DecodeString {
    public String decodeString(String s) {
        List<Character> numberCharacters = new ArrayList<>();
        Deque<Integer> numbers = new ArrayDeque<>();
        Deque<StringBuilder> groups = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                numberCharacters.add(c);
            } else if (c == '[') {
                // we can count on '[' being after a number:
                numbers.addFirst(Integer.parseInt(numberCharacters.stream().map(String::valueOf).collect(Collectors.joining())));
                numberCharacters.clear();
                groups.addFirst(current);
                current = new StringBuilder();
            } else if (c == ']') {
                String group = current.toString();
                current = groups.removeFirst();
                current.repeat(group, numbers.pop());
            } else {
                current.append(c);
            }
        }

        return current.toString();
    }
}
