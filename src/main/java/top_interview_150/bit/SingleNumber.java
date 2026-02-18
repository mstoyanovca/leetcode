package top_interview_150.bit;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result = result ^ num;
        return result;
    }
}
