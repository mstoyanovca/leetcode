package leetcode150.array_string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int n = Math.min(first.length(), last.length());
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < n && first.charAt(i) == last.charAt(i)) {
            result.append(first.charAt(i));
            i++;
        }

        return result.toString();
    }
}
