package leet_code_75.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class DecodeString {
    public String decodeString(String s) {
        List<Character> numberCharacters = new ArrayList<>();
        Deque<Integer> numberStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                numberCharacters.add(c);
            } else if (c == '[') {
                // we can count on '[' being after a number:
                numberStack.push(Integer.parseInt(numberCharacters.stream().map(String::valueOf).collect(Collectors.joining())));
                numberCharacters.clear();
                stringStack.push(builder);
                builder = new StringBuilder();
            } else if (c == ']') {
                String group = builder.toString();
                builder = stringStack.pop();
                builder.append(group.repeat(numberStack.pop()));
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }
}
