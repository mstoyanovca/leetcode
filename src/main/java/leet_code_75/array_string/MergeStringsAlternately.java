package leet_code_75.array_string;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int p1 = 0;
        int p2 = 0;

        while (p1 < word1.length() && p2 < word2.length()) {
            builder.append(word1.charAt(p1));
            p1++;
            builder.append(word2.charAt(p2));
            p2++;
        }

        if (p1 == word1.length() && p2 < word2.length()) {
            builder.append(word2.substring(p2));
        } else if (p1 < word1.length() && p2 == word2.length()) {
            builder.append(word1.substring(p1));
        }

        return builder.toString();
    }
}
