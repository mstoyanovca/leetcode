package leetcode150.array_string;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String result = "";

        int thousands = num / 1000;
        int hundreds = (num - thousands * 1000) / 100;
        int tens = (num - thousands * 1000 - hundreds * 100) / 10;
        int ones = num - thousands * 1000 - hundreds * 100 - tens * 10;

        // time complexity O(1)
        // space complexity O(1)
        // we have a constraint 1 <= num <= 3999, this should work:
        for (int i = 0; i < thousands; i++) result += "M";

        if (hundreds > 0) {
            if (hundreds < 4) {
                for (int i = 0; i < hundreds; i++) {
                    result += "C";
                }
            } else if (hundreds == 4) {
                result += "CD";
            } else if (hundreds == 5) {
                result += "D";
            } else if (hundreds == 9) {
                result += "CM";
            } else {
                result += "D";
                for (int i = 0; i < hundreds - 5; i++) {
                    result += "C";
                }
            }
        }

        if (tens > 0) {
            if (tens < 4) {
                for (int i = 0; i < tens; i++) {
                    result += "X";
                }
            } else if (tens == 4) {
                result += "XL";
            } else if (tens == 5) {
                result += "L";
            } else if (tens == 9) {
                result += "XC";
            } else {
                result += "L";
                for (int i = 0; i < tens - 5; i++) {
                    result += "X";
                }
            }
        }

        if (ones > 0) {
            if (ones < 4) {
                for (int i = 0; i < ones; i++) {
                    result += "I";
                }
            } else if (ones == 4) {
                result += "IV";
            } else if (ones == 5) {
                result += "V";
            } else if (ones == 9) {
                result += "IX";
            } else {
                result += "V";
                for (int i = 0; i < ones - 5; i++) {
                    result += "I";
                }
            }
        }

        return result;
    }
}
