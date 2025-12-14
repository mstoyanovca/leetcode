package leetcode150.intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return List.of();
        if (nums.length == 1) return List.of(String.valueOf(nums[0]));

        List<String> result = new ArrayList<>();
        int length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                length++;
            } else {
                if (length > 1) {
                    result.add(nums[i - length] + "->" + nums[i - 1]);
                } else {
                    result.add(String.valueOf(nums[i - 1]));
                }
                length = 1;
            }

            if (i == nums.length - 1) {
                if (length > 1) {
                    result.add(nums[i - length + 1] + "->" + nums[i]);
                } else {
                    result.add(String.valueOf(nums[i]));
                }
            }
        }

        return result;
    }
}
