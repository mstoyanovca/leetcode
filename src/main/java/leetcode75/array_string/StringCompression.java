package leetcode75.array_string;

public class StringCompression {
    public int compress(char[] chars) {
        char group = chars[0];
        int groupLength = 0;
        int resultPointer = 0;

        for (int i = 0; i < chars.length; i++) {
            if (group != chars[i]) {
                chars[resultPointer] = group;
                resultPointer++;
                if (groupLength > 1) resultPointer = updateChars(chars, groupLength, resultPointer);
                group = chars[i];
                groupLength = 1;
            } else {
                groupLength++;
            }
        }

        chars[resultPointer] = group;
        resultPointer++;
        if (groupLength > 1) resultPointer = updateChars(chars, groupLength, resultPointer);

        return resultPointer;
    }

    private int updateChars(char[] chars, int groupLength, int resultPointer) {
        char[] array = String.valueOf(groupLength).toCharArray();
        for (char c : array) {
            chars[resultPointer] = c;
            resultPointer++;
        }
        return resultPointer;
    }
}
