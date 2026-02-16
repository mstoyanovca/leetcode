package leetcode150.array_string;

import java.util.Arrays;
import java.util.function.Predicate;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        return String.join(" ", Arrays.stream(s.trim().split(" ")).map(String::trim).filter(Predicate.not(String::isBlank)).toList().reversed());
    }
}
