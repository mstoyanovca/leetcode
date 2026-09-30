package leet_code_75.bit_manipulation;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result = result ^ num;
        return result;
    }
}
