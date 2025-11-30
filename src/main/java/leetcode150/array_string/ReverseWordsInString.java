package leetcode150.array_string;

import java.util.Arrays;
import java.util.List;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        List<String> list = Arrays.stream(s.trim().split(" ")).map(String::trim).filter(e -> !e.isBlank()).toList().reversed();
        list.forEach(e -> result.append(e).append(" "));

        return result.toString().stripTrailing();
    }
}
