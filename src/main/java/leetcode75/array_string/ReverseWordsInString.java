package leetcode75.array_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        List<String> input = new ArrayList<>(Arrays.stream(s.split(" ")).map(String::trim).filter(e -> !e.isEmpty()).toList());
        Collections.reverse(input);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.size(); i++) {
            builder.append(input.get(i));
            if (i < input.size() - 1) builder.append(" ");
        }
        return builder.toString();
    }
}
