package top_interview_150.bit;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int result = 0;

        while (n > 0) {
            if ((n & 0x00000001) == 1) result++;
            n = n >>> 1;
        }

        return result;
    }

    public int hammingWeight2(int n) {
        int result = 0;
        for (char c : Integer.toString(n, 2).toCharArray()) if (c == '1') result++;
        return result;
    }
}
