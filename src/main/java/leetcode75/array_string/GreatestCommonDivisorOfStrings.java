package leetcode75.array_string;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String string1, String string2) {
        String longerString;
        String shorterString;
        if (string1.length() > string2.length()) {
            longerString = string1;
            shorterString = string2;
        } else {
            longerString = string2;
            shorterString = string1;
        }

        StringBuilder builder = new StringBuilder(shorterString);
        if (isDivisor(longerString, builder.toString())) {
            return builder.toString();
        } else {
            builder.deleteCharAt(builder.length() - 1);
        }

        while (!builder.isEmpty() && (!isDivisor(longerString, builder.toString()) || !isDivisor(shorterString, builder.toString()))) {
            builder.deleteCharAt(builder.length() - 1);
        }

        return builder.toString();
    }

    private boolean isDivisor(String dividend, String divisor) {
        if (dividend.length() % divisor.length() == 0) {
            StringBuilder builder = new StringBuilder();
            builder.append(divisor.repeat(dividend.length() / divisor.length()));
            return dividend.contentEquals(builder);
        } else {
            return false;
        }
    }
}
