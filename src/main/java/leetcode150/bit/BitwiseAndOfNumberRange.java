package leetcode150.bit;

public class BitwiseAndOfNumberRange {
    public int rangeBitwiseAnd(int left, int right) {
        int counter = 0;

        while (left != right) {
            left = left >> 1;
            right = right >> 1;
            counter++;
        }

        // bitwise AND for numbers in range will end up with zeroes in all digits that change;
        // shift back to the left, where it was, fill up with zeroes:
        return left << counter;
    }

    // time limit exceeded:
    public int rangeBitwiseAnd2(int left, int right) {
        long result = left;
        for (long i = left + 1; i <= right; i++) result = result & i;
        return (int) result;
    }
}
