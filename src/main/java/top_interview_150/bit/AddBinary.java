package top_interview_150.bit;

import java.math.BigInteger;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) carry += Character.getNumericValue(a.charAt(i));
            i--;
            if (j >= 0) carry += Character.getNumericValue(b.charAt(j));
            j--;
            result.append(carry % 2);
            carry /= 2;
        }

        return result.reverse().toString();
    }

    public String addBinary2(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }
}
