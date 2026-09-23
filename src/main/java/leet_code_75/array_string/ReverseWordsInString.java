package leet_code_75.array_string;

import java.util.Arrays;
import java.util.function.Predicate;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        // I assume:
        // time complexity O(n)
        // space complexity O(1)
        return String.join(" ", Arrays.stream(s.split(" ")).filter(Predicate.not(String::isBlank)).map(String::trim).toList().reversed());
    }
}
