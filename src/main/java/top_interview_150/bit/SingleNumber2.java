package top_interview_150.bit;

public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        int result = 0;
        int acc = 0;

        for (int num : nums) {
            result = (result ^ num) & ~acc;
            acc = (acc ^ num) & ~result;
        }

        return result;
    }
}
