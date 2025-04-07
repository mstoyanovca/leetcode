package leetcode75.bit_manipulation;

// problem 68:
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result = result ^ num;
        return result;
    }
}
