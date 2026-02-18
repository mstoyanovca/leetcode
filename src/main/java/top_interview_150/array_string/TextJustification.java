package top_interview_150.array_string;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int n = words.length;
        int left = 0;
        int right = 0;
        int lineLength = 0;
        StringBuilder line = new StringBuilder();
        List<String> result = new ArrayList<>();

        // I assume:
        // time complexity O(n)
        // space complexity O(n)
        while (right < n) {
            // (right - left) = minimum number of spaces needed:
            while (right < n && lineLength + words[right].length() + (right - left) <= maxWidth) {
                lineLength += words[right].length();
                right++;
            }

            int spaces = maxWidth - lineLength;
            int groups = Math.max(1, right - left - 1);
            int spacesPerGroup = spaces / groups;
            int reminder = spaces % groups;

            for (int i = left; i < right; i++) {
                line.append(words[i]);
                if (right != n && i < right - 1) {
                    // for all lines except the last; do not add a space after the last word:
                    line.append(" ".repeat(spacesPerGroup));
                    if (reminder > 0) {
                        // spread the reminder evenly between the leftmost words:
                        line.append(" ");
                        reminder--;
                    }
                } else if (right != n && right - left == 1) {
                    // not the last line, with a single word:
                    line.append(" ".repeat(spaces));
                } else if (right == n) {
                    // for the last line:
                    if (i < right - 1) {
                        line.append(" ");
                        spaces--;
                    } else {
                        line.append(" ".repeat(spaces));
                    }
                }
            }

            result.add(line.toString());
            line.setLength(0);
            lineLength = 0;
            left = right;
        }

        return result;
    }
}
