package top_interview_150.array_string;

public class ZigZagConversion {
    public String convert(String s, int rows) {
        int n = s.length();
        if (rows == 1) return s;
        StringBuilder result = new StringBuilder();

        // time complexity O(n)
        // space complexity O(n)
        for (int row = 0; row < rows; row++) {
            int i = row;
            while (i < n) {
                result.append(s.charAt(i));
                i += 2 * (rows - i % (rows - 1) - 1);
            }
        }

        return result.toString();
    }
}
