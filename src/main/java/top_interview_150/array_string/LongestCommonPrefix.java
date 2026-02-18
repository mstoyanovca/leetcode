package top_interview_150.array_string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int n = Math.min(first.length(), last.length());
        StringBuilder result = new StringBuilder();

        // n - length of the string array;
        // m - length of the longer of the first and the last words;
        // time complexity O(n * log(n) + O(m))
        // space complexity O(1)
        int i = 0;
        while (i < n && first.charAt(i) == last.charAt(i)) {
            result.append(first.charAt(i));
            i++;
        }

        return result.toString();
    }
}
