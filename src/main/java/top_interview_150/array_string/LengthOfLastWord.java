package top_interview_150.array_string;

import java.util.Arrays;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // time complexity O(n)
        // space complexity O(n)
        return Arrays.stream(s.split(" ")).toList().getLast().trim().length();
    }
}
