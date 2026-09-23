package leet_code_75.array_string;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > second) {
                return true;
            }
            if (num < first) {
                first = num;
            }
            if (num > first) {
                second = num;
            }
        }

        return false;
    }
}
