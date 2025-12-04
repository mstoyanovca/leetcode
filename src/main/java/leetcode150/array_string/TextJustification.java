package leetcode150.array_string;

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

    public List<String> fullJustifyBruteForce(String[] words, int maxWidth) {
        int n = words.length;
        List<String> line = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int currentLineLength = line.stream().mapToInt(String::length).sum();
            int minNumberOfSpaces = Math.max(0, line.size() - 1);
            if (line.isEmpty() && currentLineLength + minNumberOfSpaces + words[i].length() <= maxWidth) {
                // the first word in a line, might be the only one:
                line.add(words[i]);
            } else if (!line.isEmpty() && currentLineLength + minNumberOfSpaces + words[i].length() + 1 <= maxWidth) {
                // add a word to the line with minimum one space on the left:
                line.add(words[i]);
            } else if (!line.isEmpty() && currentLineLength + minNumberOfSpaces + words[i].length() + 1 > maxWidth) {
                // start a new line:
                if (i > 0) i--;
                result.add(justify(line, maxWidth));
                line.clear();
            }
            if (i == n - 1) {
                // the last word, could be alone on a line, leave the loop:
                result.add(justifyLastLine(line, maxWidth));
                line.clear();
            }
        }

        return result;
    }

    private String justify(List<String> line, int maxWidth) {
        int wordsTotalLength = line.stream().mapToInt(String::length).sum();
        int totalNumberOfSpaces = maxWidth - wordsTotalLength;
        int spacesPerGroup = line.size() > 1 ? totalNumberOfSpaces / (line.size() - 1) : 1;
        int reminder = line.size() > 1 ? totalNumberOfSpaces % (line.size() - 1) : 0;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line.size(); i++) {
            builder.append(line.get(i));
            if (i == 0) builder.append(" ".repeat(reminder));
            if (i < line.size() - 1) builder.append(" ".repeat(spacesPerGroup));
            if (line.size() == 1) builder.append(" ".repeat(totalNumberOfSpaces));
        }

        return builder.toString();
    }

    private String justifyLastLine(List<String> line, int maxWidth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line.size(); i++) {
            builder.append(line.get(i));
            if (i < line.size() - 1) builder.append(" ");
        }
        builder.append(" ".repeat(Math.max(0, maxWidth - builder.length())));

        return builder.toString();
    }
}
