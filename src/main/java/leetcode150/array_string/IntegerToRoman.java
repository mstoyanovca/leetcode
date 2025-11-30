package leetcode150.array_string;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        int thousands = num / 1000;
        int hundreds = (num - thousands * 1000) / 100;
        int tens = (num - thousands * 1000 - hundreds * 100) / 10;
        int ones = num - thousands * 1000 - hundreds * 100 - tens * 10;

        // time complexity O(1)
        // space complexity O(1)
        // we have a constraint 1 <= num <= 3999, this should work:
        result.append("M".repeat(Math.max(0, thousands)));

        if (hundreds > 0) {
            if (hundreds < 4) {
                result.append("C".repeat(hundreds));
            } else if (hundreds == 4) {
                result.append("CD");
            } else if (hundreds == 5) {
                result.append("D");
            } else if (hundreds == 9) {
                result.append("CM");
            } else {
                result.append("D");
                result.append("C".repeat(hundreds - 5));
            }
        }

        if (tens > 0) {
            if (tens < 4) {
                result.append("X".repeat(tens));
            } else if (tens == 4) {
                result.append("XL");
            } else if (tens == 5) {
                result.append("L");
            } else if (tens == 9) {
                result.append("XC");
            } else {
                result.append("L");
                result.append("X".repeat(tens - 5));
            }
        }

        if (ones > 0) {
            if (ones < 4) {
                result.append("I".repeat(ones));
            } else if (ones == 4) {
                result.append("IV");
            } else if (ones == 5) {
                result.append("V");
            } else if (ones == 9) {
                result.append("IX");
            } else {
                result.append("V");
                result.append("I".repeat(ones - 5));
            }
        }

        return result.toString();
    }
}
