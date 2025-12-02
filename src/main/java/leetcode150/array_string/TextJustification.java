package leetcode150.array_string;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
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
                result.add(justify(line, maxWidth));
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
}
